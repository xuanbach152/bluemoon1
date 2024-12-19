/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bluemoon.service;

import com.bluemoon.dao.LoaiPhiDAO;
import com.bluemoon.dao.LoaiPhiDAOImpl;
import com.bluemoon.model.LoaiPhi;
import java.util.List;

/**
 *
 * @author hi
 */
public class LoaiPhiServiceImpl implements LoaiPhiService {
    private LoaiPhiDAO loaiPhiDAO = null;

    public LoaiPhiServiceImpl() {
        this.loaiPhiDAO = new LoaiPhiDAOImpl();
    }
    
    @Override
    public List<LoaiPhi> getList1() {
        return loaiPhiDAO.getList1();
    }

    @Override
    public List<LoaiPhi> getList2() {
        return loaiPhiDAO.getList2();
    }

    @Override
    public List<LoaiPhi> getList3() {
        return loaiPhiDAO.getList3();
    }
}
