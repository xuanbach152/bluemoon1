/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bluemoon.main;

import com.bluemoon.dao.DBConnect;
import com.bluemoon.view.DangNhapJDialog;
import com.bluemoon.view.MainJFrame;
import java.sql.Connection;

/**
 *
 * @author hi
 */
public class Main {
    public static void main(String[] args) {
    //    new MainJFrame().setVisible(true);
        DangNhapJDialog dialog = new DangNhapJDialog(null, true);
        dialog.setTitle("Đăng Nhập Hệ Thống");
        dialog.setResizable(false);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        //Connection conn = DBConnect.getConnection();
        //DBConnect.closeConnection();
    }
}
