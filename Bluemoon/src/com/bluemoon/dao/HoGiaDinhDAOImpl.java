/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bluemoon.dao;

import com.bluemoon.model.HoGiaDinh;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hi
 */
public class HoGiaDinhDAOImpl implements HoGiaDinhDAO{

    @Override
    public List<HoGiaDinh> getList() {
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT hgd.ma_hogd, ten_hogd, dia_chi, COUNT(ma_nhan_khau) AS so_luong_nhan_khau, dien_tich, ngay_thue\n" +
                     "FROM ho_gia_dinh hgd\n" +
                     "JOIN nhan_khau nk ON nk.ma_hogd = hgd.ma_hogd\n" +
                     "GROUP BY hgd.ma_hogd;";
        List<HoGiaDinh> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoGiaDinh hoGiaDinh = new HoGiaDinh();
                hoGiaDinh.setMa_hogd(rs.getString("hgd.ma_hogd"));
                hoGiaDinh.setTen_hogd(rs.getString("ten_hogd"));
                hoGiaDinh.setDia_chi(rs.getString("dia_chi"));
                hoGiaDinh.setSo_luong_nhan_khau(rs.getInt("so_luong_nhan_khau"));
                hoGiaDinh.setDien_tich(rs.getInt("dien_tich"));
                hoGiaDinh.setNgay_thue(rs.getDate("ngay_thue"));
                list.add(hoGiaDinh);
            }
            ps.close();
            cons.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    @Override
    public String CreateOrUpdate(HoGiaDinh hoGiaDinh) {
        try {
            Connection cons = DBConnect.getConnection();
            String sql = "INSERT INTO ho_gia_dinh(ma_hogd, ten_hogd, dia_chi, so_luong_nhan_khau, dien_tich, ngay_thue) VALUES(?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE  ten_hogd = VALUES(ten_hogd), dia_chi = VALUES(dia_chi), so_luong_nhan_khau = VALUES(so_luong_nhan_khau), dien_tich = VALUES(dien_tich), ngay_thue = VALUES(ngay_thue);";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, hoGiaDinh.getMa_hogd());
            ps.setString(2, hoGiaDinh.getTen_hogd());
            ps.setString(3, hoGiaDinh.getDia_chi());
            ps.setInt(4, hoGiaDinh.getSo_luong_nhan_khau());
            ps.setDate(6, new Date (hoGiaDinh.getNgay_thue().getTime()));
            ps.setInt(5, hoGiaDinh.getDien_tich());
            ps.execute();
            
            ps.close();
            cons.close();
            return hoGiaDinh.getMa_hogd();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "NULL";
    }
    
    @Override
    public String Remove(HoGiaDinh hoGiaDinh) {
        try {
            Connection cons = DBConnect.getConnection();
            String sql = "DELETE FROM ho_gia_dinh WHERE ma_hogd = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            //ps.setInt(1, nhanKhau.getSTT());
            ps.setString(1, hoGiaDinh.getMa_hogd());
            ps.execute();
            
            ps.close();
            cons.close();
            return hoGiaDinh.getMa_hogd();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "NULL";
    }

}
    
    

