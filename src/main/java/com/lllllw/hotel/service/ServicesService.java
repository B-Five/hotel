package com.lllllw.hotel.service;

import com.lllllw.hotel.dao.ServicesMapper;
import com.lllllw.hotel.dao.ServicesTypeMapper;
import com.lllllw.hotel.model.Services;
import com.lllllw.hotel.model.ServicesExample;
import com.lllllw.hotel.model.ServicesType;
import com.lllllw.hotel.model.ServicesTypeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesService {

    @Autowired
    private ServicesMapper servicesMapper;

    @Autowired
    private ServicesTypeMapper servicesTypeMapper;

    public List<Services> searchAllServices(){
        ServicesExample example = new ServicesExample();
        return servicesMapper.selectByExample(example);
    }

    public List<ServicesType> searchAllServicesType(){
        ServicesTypeExample example = new ServicesTypeExample();
        return servicesTypeMapper.selectByExample(example);
    }

}
