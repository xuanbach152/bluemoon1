/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bluemoon.dao;

import com.bluemoon.model.LoaiPhi;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author hi
 */
public class LoaiPhiDAOImpl implements LoaiPhiDAO {

    @Override
    public List<LoaiPhi> getList1() {
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT ma_phi, ten_phi, tien_m2 FROM loai_phi WHERE tien_m2 <> 0";
        List<LoaiPhi> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LoaiPhi loaiPhi = new LoaiPhi();
                loaiPhi.setMa_phi(rs.getString("ma_phi"));
                loaiPhi.setTen_phi(rs.getString("ten_phi"));
                loaiPhi.setTien_m2(rs.getInt("tien_m2"));
                list.add(loaiPhi);
            }
            ps.close();
            cons.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<LoaiPhi> getList3() {
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT ma_phi, ten_phi, tien_so FROM loai_phi WHERE tien_so <> 0;";
        List<LoaiPhi> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LoaiPhi loaiPhi = new LoaiPhi();
                loaiPhi.setMa_phi(rs.getString("ma_phi"));
                loaiPhi.setTen_phi(rs.getString("ten_phi"));
                loaiPhi.setTien_so(rs.getInt("tien_so"));
                list.add(loaiPhi);
            }
            ps.close();
            cons.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<LoaiPhi> getList2() {
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT ma_phi, ten_phi, tien_xe FROM loai_phi WHERE tien_xe <> 0;";
        List<LoaiPhi> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LoaiPhi loaiPhi = new LoaiPhi();
                loaiPhi.setMa_phi(rs.getString("ma_phi"));
                loaiPhi.setTen_phi(rs.getString("ten_phi"));
                loaiPhi.setTien_xe(rs.getInt("tien_xe"));
                list.add(loaiPhi);
            }
            ps.close();
            cons.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
}
