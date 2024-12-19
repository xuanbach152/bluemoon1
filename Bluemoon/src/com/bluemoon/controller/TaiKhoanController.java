/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bluemoon.controller;

import com.bluemoon.model.TaiKhoan;
import com.bluemoon.service.TaiKhoanService;
import com.bluemoon.service.TaiKhoanServiceImpl;
import com.bluemoon.utility.ClassTableModel;
import com.bluemoon.view.MainJFrame;
import com.bluemoon.view.TaiKhoanJFrame;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author hi
 */
public class TaiKhoanController {
    private JDialog dialog;
    private JButton btnSubmit;
    private JTextField jtfTenTaiKhoan;
    private JPasswordField jtfMatKhau;
    private JLabel jlbMsg;
    
    private TaiKhoanService taiKhoanService = null;

    public TaiKhoanController(JDialog dialog, JButton btnSubmit, JTextField jtfTenTaiKhoan, JPasswordField jtfMatKhau, JLabel jlbMsg) {
        this.dialog = dialog;
        this.btnSubmit = btnSubmit;
        this.jtfTenTaiKhoan = jtfTenTaiKhoan;
        this.jtfMatKhau = jtfMatKhau;
        this.jlbMsg = jlbMsg;
        
        taiKhoanService = new TaiKhoanServiceImpl();
    }
    
    public void setEvent(){
         btnSubmit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    if (jtfTenTaiKhoan.getText().length() == 0
                            || jtfMatKhau.getText().length() == 0) {
                        jlbMsg.setText("Vui lòng nhập dữ liệu bắt buộc!");
                    } else {
                        TaiKhoan taiKhoan = taiKhoanService.login(jtfTenTaiKhoan.getText(), jtfMatKhau.getText());
                        if (taiKhoan == null) {
                            jlbMsg.setText("Tên đăng nhập và mật khẩu không đúng!");
                        } else {
                            if (!taiKhoan.isTinh_trang()) {
                                jlbMsg.setText("Tài khoản của bạn đang bị tạm khóa!");
                            } else {
                                MainJFrame frame = new MainJFrame();
                                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                                frame.setVisible(true);
                                dialog.dispose();
                            }
                        }
                    }
                } catch (Exception ex) {
                    jlbMsg.setText(ex.toString());
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnSubmit.setBackground(new Color(0, 200, 83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSubmit.setBackground(new Color(100, 221, 23));
            }
        });
    }
    
    private JPanel jpnView;
    private JButton btnAdd;
    private JTextField jtfSearch;
    
    private ClassTableModel classTableModel = null;
    private final String[] COLUMNS = {"STT", "Tài khoản", "Mật khẩu", "Tình trạng"};
    
    private TableRowSorter<TableModel> rowSorter = null;
    
    public TaiKhoanController(JPanel jpnView, JButton btnAdd, JTextField jtfSearch) {
        this.jpnView = jpnView;
        this.btnAdd = btnAdd;
        this.jtfSearch = jtfSearch;
        
        this.classTableModel = new ClassTableModel();
        this.taiKhoanService = new TaiKhoanServiceImpl();
    }
     public void setDataToTable() {
        List<TaiKhoan> listItem = taiKhoanService.getList();
        DefaultTableModel model = classTableModel.setTableTaiKhoan(listItem, COLUMNS);
        JTable table = new JTable(model);

        rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);

        jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
        
        table.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() == 2 && table.getSelectedRow() != -1){
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    int selectedRowIndex = table.getSelectedRow();
                    selectedRowIndex = table.convertRowIndexToModel (selectedRowIndex);
                    
                    TaiKhoan taiKhoan = new TaiKhoan();
                    taiKhoan.setMa_tai_khoan((int)model.getValueAt(selectedRowIndex, 0));
                    taiKhoan.setTen_tai_khoan(model.getValueAt(selectedRowIndex, 1).toString());
                    taiKhoan.setMat_khau(model.getValueAt(selectedRowIndex, 2).toString());
                    
                    //taiKhoan.setNgay_sinh((Date) model.getValueAt(selectedRowIndex, 4));
                            //classFormat.covertDateToDateSql(
                            //classFormat.covertStringToDate(model.getValueAt(selectedRowIndex, 3).toString(), "dd/MM/yyyy")));
                    taiKhoan.setTinh_trang((boolean)model.getValueAt(selectedRowIndex, 3));
                    
                    TaiKhoanJFrame frame = new TaiKhoanJFrame(taiKhoan);
                    frame.setTitle("Thông tin tài khoản");
                    frame.setResizable(false);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                }
            }
         
        });

        // design
//        table.getColumnModel().getColumn(1).setMaxWidth(150);
//        table.getColumnModel().getColumn(1).setMinWidth(150);
//        table.getColumnModel().getColumn(1).setPreferredWidth(150);
        
     
        
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        
        for(int i = 0; i < table.getColumnCount() - 1; i++){
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        
        JScrollPane scroll = new JScrollPane();
        scroll.getViewport().add(table);
        scroll.setPreferredSize(new Dimension(1350, 850));
        jpnView.removeAll();
        jpnView.setLayout(new CardLayout());
        jpnView.add(scroll);
        jpnView.validate();
        jpnView.repaint();
    }
     
    public void setEvent1(){
        btnAdd.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                TaiKhoanJFrame frame = new TaiKhoanJFrame(new TaiKhoan());
                frame.setTitle("Thông tin tài khoản");
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setVisible(true);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnAdd.setBackground(new Color(0, 200, 83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnAdd.setBackground(new Color(100, 221, 23));
            }
        });
    }
    
    
    
}
