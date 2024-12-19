/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bluemoon.service;

import com.bluemoon.model.ThuPhi;
import java.util.List;

/**
 *
 * @author hi
 */
public interface ThuPhiService {
    public List<ThuPhi> getList1();
    public List<ThuPhi> getList2();
    public List<ThuPhi> getList3();
    
    public String CreateOrUpdate(ThuPhi thuPhi);
    public String Remove(ThuPhi thuPhi);
}
