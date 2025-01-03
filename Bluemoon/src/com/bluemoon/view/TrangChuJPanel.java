/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.bluemoon.view;

import com.bluemoon.bean.DanhMucBean;
import com.bluemoon.controller.ChuyenManHinhController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hi
 */
public class TrangChuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TrangChuJPanel
     */
    public TrangChuJPanel() {
        initComponents();
        ChuyenManHinhController controller = new ChuyenManHinhController(jpnView1);

        
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("TrangChu", jpnTrangChu, jlbTrangChu));
        listItem.add(new DanhMucBean("HoGiaDinhView", jpn1, jlb1 ));
        listItem.add(new DanhMucBean("NhanKhauView", jpn2, jlb2));
        listItem.add(new DanhMucBean("ThuPhiView", jpn3, jlb3));
        
        controller.setEvent1(listItem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnView1 = new javax.swing.JPanel();
        jpn1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlb1 = new javax.swing.JLabel();
        jpn2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlb2 = new javax.swing.JLabel();
        jpn3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlb3 = new javax.swing.JLabel();
        jpnTrangChu = new javax.swing.JPanel();
        jlbTrangChu = new javax.swing.JLabel();

        jpnView1.setBackground(new java.awt.Color(204, 204, 255));

        jpn1.setBackground(new java.awt.Color(255, 85, 85));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bluemoon/images/icon_home_32dp.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("100 +");

        jlb1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlb1.setForeground(new java.awt.Color(255, 255, 255));
        jlb1.setText("Hộ gia đình");

        javax.swing.GroupLayout jpn1Layout = new javax.swing.GroupLayout(jpn1);
        jpn1.setLayout(jpn1Layout);
        jpn1Layout.setHorizontalGroup(
            jpn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGroup(jpn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2))
                    .addGroup(jpn1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jlb1)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jpn1Layout.setVerticalGroup(
            jpn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn1Layout.createSequentialGroup()
                .addGroup(jpn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1))
                    .addGroup(jpn1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2)
                        .addGap(99, 99, 99)
                        .addComponent(jlb1)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jpn2.setBackground(new java.awt.Color(103, 195, 239));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bluemoon/images/icon_people_32dp.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("100 +");

        jlb2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlb2.setForeground(new java.awt.Color(255, 255, 255));
        jlb2.setText("Nhân khẩu");

        javax.swing.GroupLayout jpn2Layout = new javax.swing.GroupLayout(jpn2);
        jpn2.setLayout(jpn2Layout);
        jpn2Layout.setHorizontalGroup(
            jpn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel4)
                .addGroup(jpn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5))
                    .addGroup(jpn2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jlb2)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jpn2Layout.setVerticalGroup(
            jpn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn2Layout.createSequentialGroup()
                .addGroup(jpn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4))
                    .addGroup(jpn2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel5)
                        .addGap(99, 99, 99)
                        .addComponent(jlb2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpn3.setBackground(new java.awt.Color(121, 196, 71));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bluemoon/images/icon_fee_32dp.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("100 +");

        jlb3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlb3.setForeground(new java.awt.Color(255, 255, 255));
        jlb3.setText("Phí chung cư");

        javax.swing.GroupLayout jpn3Layout = new javax.swing.GroupLayout(jpn3);
        jpn3.setLayout(jpn3Layout);
        jpn3Layout.setHorizontalGroup(
            jpn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel7)
                .addGroup(jpn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel8))
                    .addGroup(jpn3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jlb3)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jpn3Layout.setVerticalGroup(
            jpn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn3Layout.createSequentialGroup()
                .addGroup(jpn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel7))
                    .addGroup(jpn3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel8)
                        .addGap(99, 99, 99)
                        .addComponent(jlb3)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jpnTrangChu.setBackground(new java.awt.Color(204, 204, 255));

        jlbTrangChu.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jlbTrangChu.setText("Trang chủ");

        javax.swing.GroupLayout jpnTrangChuLayout = new javax.swing.GroupLayout(jpnTrangChu);
        jpnTrangChu.setLayout(jpnTrangChuLayout);
        jpnTrangChuLayout.setHorizontalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jpnTrangChuLayout.setVerticalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnView1Layout = new javax.swing.GroupLayout(jpnView1);
        jpnView1.setLayout(jpnView1Layout);
        jpnView1Layout.setHorizontalGroup(
            jpnView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnView1Layout.createSequentialGroup()
                .addGroup(jpnView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnView1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jpn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jpn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jpn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnView1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jpnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jpnView1Layout.setVerticalGroup(
            jpnView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnView1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jpnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addGroup(jpnView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jpn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(321, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnView1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnView1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlb1;
    private javax.swing.JLabel jlb2;
    private javax.swing.JLabel jlb3;
    private javax.swing.JLabel jlbTrangChu;
    private javax.swing.JPanel jpn1;
    private javax.swing.JPanel jpn2;
    private javax.swing.JPanel jpn3;
    private javax.swing.JPanel jpnTrangChu;
    private javax.swing.JPanel jpnView1;
    // End of variables declaration//GEN-END:variables
}
