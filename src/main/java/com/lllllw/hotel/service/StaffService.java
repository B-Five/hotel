package com.lllllw.hotel.service;

import com.lllllw.hotel.dao.StaffMapper;
import com.lllllw.hotel.model.Staff;
import com.lllllw.hotel.model.StaffExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    @Autowired
    private StaffMapper staffMapper;

    public List<Staff> searchAllStaff(){
        StaffExample example = new StaffExample();
        return staffMapper.selectByExample(example);
    }
}
