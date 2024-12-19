/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bluemoon.controller;

import com.bluemoon.bean.DanhMucBean;
import com.bluemoon.view.DichVuJPanel;
import com.bluemoon.view.HoGiaDinhJPanel;
import com.bluemoon.view.HoGiaDinhViewJPanel;


import com.bluemoon.view.NhanKhauJPanel;
import com.bluemoon.view.NhanKhauViewJPanel;
import com.bluemoon.view.TaiKhoanJPanel;
import com.bluemoon.view.ThongKeJPanel;
import com.bluemoon.view.ThuPhiJPanel;
import com.bluemoon.view.ThuPhiViewJPanel;
import com.bluemoon.view.TrangChuJPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author hi
 */
public class ChuyenManHinhController {
    
    private JPanel root;
    private String kindSelected = "";
    
    private List<DanhMucBean> listItem = null;

    public ChuyenManHinhController(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem ){
        kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(96, 100, 191));
        jlbItem.setBackground(new Color(96, 100, 191));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChuJPanel());
        root.validate();
        root.repaint();
    }
    
    public void setEvent(List<DanhMucBean> listItem){
        this.listItem = listItem;
        for(DanhMucBean item : listItem){
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }
    
    class LabelEvent implements MouseListener {
        
        private JPanel node;
        private String kind;
        
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        
        

        @Override
        public void mouseClicked(MouseEvent e) {
            switch(kind){
                case "TrangChu":
                    node = new TrangChuJPanel();
                    break;
                case "HoGiaDinh":
                    node = new HoGiaDinhJPanel();
                    break;
                case "NhanKhau":
                    node = new NhanKhauJPanel();
                    break;
                case "ThuPhi":
                    node = new ThuPhiJPanel();
                    break;
                case "ThongKe":
                    node = new ThongKeJPanel();
                    break;  
                case "TaiKhoan":
                    node = new TaiKhoanJPanel();
                    break;   
                case "DichVu":
                    node = new DichVuJPanel();
                    break;
                default:
                    node = new TrangChuJPanel();
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(96, 100, 191));
            jlbItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(96, 100, 191));
            jlbItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!kindSelected.equalsIgnoreCase(kind)){
                jpnItem.setBackground(new Color(76, 175, 80));
                jlbItem.setBackground(new Color(76, 175, 80));
            }
        }
        
    } 
       
    private void setChangeBackground(String kind){
        for(DanhMucBean item: listItem){
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJpn().setBackground(new Color(96, 100, 191));
                item.getJlb().setBackground(new Color(96, 100, 191));
            }else{
                item.getJpn().setBackground(new Color(76, 175, 80));
                item.getJlb().setBackground(new Color(76, 175, 80));
            }
        }
    }
    
    class LabelEvent1 implements MouseListener {
        
        private JPanel node;
        private String kind;
        
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent1(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        
        

        @Override
        public void mouseClicked(MouseEvent e) {
            switch(kind){
                case "TrangChu":
                    node = new TrangChuJPanel();
                    break;
                case "HoGiaDinhView":
                    node = new HoGiaDinhViewJPanel();
                    break;
                case "NhanKhauView":
                    node = new NhanKhauViewJPanel();
                    break;
                case "ThuPhiView":
                    node = new ThuPhiViewJPanel();
                    break;
                
//                case "LoaiPhi2":
//                    node = new LoaiPhi2JPanel();
//                    break; 
//                case "LoaiPhi3":
//                    node = new LoaiPhi3JPanel();
//                    break;    
                default:
                    node = new TrangChuJPanel();
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            //setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    public void setEvent1(List<DanhMucBean> listItem){
        this.listItem = listItem;
        for(DanhMucBean item : listItem){
            item.getJlb().addMouseListener(new LabelEvent1(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }
    
}
