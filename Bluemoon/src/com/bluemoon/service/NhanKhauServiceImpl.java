/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bluemoon.service;

import com.bluemoon.dao.NhanKhauDAO;
import com.bluemoon.dao.NhanKhauDAOImpl;
import com.bluemoon.model.NhanKhau;
import java.util.List;

/**
 *
 * @author hi
 */
public class NhanKhauServiceImpl implements NhanKhauService {
    private NhanKhauDAO nhanKhauDAO = null;

    public NhanKhauServiceImpl() {
        this.nhanKhauDAO = new NhanKhauDAOImpl();
    }
    @Override
    public List<NhanKhau> getList() {
        return nhanKhauDAO.getList();
    }
    @Override
    public String CreateOrUpdate(NhanKhau nhanKhau){
        return nhanKhauDAO.CreateOrUpdate(nhanKhau);
    }
    
    @Override
    public String Remove(NhanKhau nhanKhau){
        return nhanKhauDAO.Remove(nhanKhau);
    }
    
    
}
