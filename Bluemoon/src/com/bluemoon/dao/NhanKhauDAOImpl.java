package com.bluemoon.dao;

import com.bluemoon.model.NhanKhau;
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
public class NhanKhauDAOImpl implements NhanKhauDAO {

    @Override
    public List<NhanKhau> getList() {
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT * FROM nhan_khau";
        List<NhanKhau> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanKhau nhanKhau = new NhanKhau();
                //nhanKhau.setSTT(rs.getInt("STT"));
                nhanKhau.setMa_nhan_khau(rs.getString("ma_nhan_khau"));
                nhanKhau.setSo_cccd(rs.getString("so_cccd"));
                nhanKhau.setMa_hogd(rs.getString("ma_hogd"));
                nhanKhau.setHo_ten(rs.getString("ho_ten"));
                nhanKhau.setNgay_sinh(rs.getDate("ngay_sinh"));
                nhanKhau.setGioi_tinh(rs.getBoolean("gioi_tinh"));
                nhanKhau.setQuan_he_chu_ho(rs.getString("quan_he_chu_ho"));
                list.add(nhanKhau);
            }
            ps.close();
            cons.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    @Override
    public String CreateOrUpdate(NhanKhau nhanKhau) {
        try {
            Connection cons = DBConnect.getConnection();
            String sql = "INSERT INTO nhan_khau(ma_nhan_khau, so_cccd, ma_hogd, ho_ten, ngay_sinh, gioi_tinh, quan_he_chu_ho) VALUES(?, ?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE  ho_ten = VALUES(ho_ten), ngay_sinh = VALUES(ngay_sinh), gioi_tinh = VALUES(gioi_tinh), quan_he_chu_ho = VALUES(quan_he_chu_ho), ma_hogd = VALUES(ma_hogd), so_cccd = VALUES(so_cccd);";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, nhanKhau.getMa_nhan_khau());
            ps.setString(2, nhanKhau.getSo_cccd());
            ps.setString(3, nhanKhau.getMa_hogd());
            ps.setString(4, nhanKhau.getHo_ten());
            ps.setDate(5, nhanKhau.getNgay_sinh());
            ps.setBoolean(6, nhanKhau.isGioi_tinh());
            ps.setString(7, nhanKhau.getQuan_he_chu_ho());
            ps.execute();
            
            ps.close();
            cons.close();
            return nhanKhau.getMa_nhan_khau();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "NULL";
    }
    
    @Override
    public String Remove(NhanKhau nhanKhau) {
        try {
            Connection cons = DBConnect.getConnection();
            String sql = "DELETE FROM nhan_khau WHERE ma_nhan_khau = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            //ps.setInt(1, nhanKhau.getSTT());
            ps.setString(1, nhanKhau.getMa_nhan_khau());
            ps.execute();
            
            ps.close();
            cons.close();
            return nhanKhau.getMa_nhan_khau();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "NULL";
    }
    
}
    