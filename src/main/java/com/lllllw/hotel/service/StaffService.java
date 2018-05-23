package com.lllllw.hotel.service;

import com.lllllw.hotel.dao.StaffMapper;
import com.lllllw.hotel.model.Staff;
import com.lllllw.hotel.model.StaffExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class StaffService {

    @Autowired
    private StaffMapper staffMapper;

    public List<Staff> searchAllStaff(){
        StaffExample example = new StaffExample();
        return staffMapper.selectByExample(example);
    }

    public boolean loginCheck(String staffCode,String password){
        StaffExample example = new StaffExample();
        StaffExample.Criteria criteria =  example.createCriteria();
        criteria.andSCodeEqualTo(staffCode);
        List<Staff> list = staffMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(list)){
            return false;
        }
        else {
            Staff staff = list.get(0);
            return password.equals(staff.getsPssword());
        }
    }
}
