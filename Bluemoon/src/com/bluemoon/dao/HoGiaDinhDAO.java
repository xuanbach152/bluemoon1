package com.bluemoon.dao;

import com.bluemoon.model.HoGiaDinh;
import java.util.List;

/**
 *
 * @author hi
 */
public interface HoGiaDinhDAO {
    public List<HoGiaDinh> getList();
    
    public String CreateOrUpdate(HoGiaDinh hoGiaDinh);
    public String Remove(HoGiaDinh hoGiaDinh);
}
