package com.lllllw.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lllllw.hotel.dao.OrderMapper;
import com.lllllw.hotel.model.Order;
import com.lllllw.hotel.model.OrderExample;
import com.lllllw.hotel.model.OrderExample.Criteria;

@Service
public class CustomerOrderService {

	@Autowired
	OrderMapper ordermapper;
	
	public List<Order> selectCustomerOrder(int cid){
		OrderExample example = new OrderExample();
		Criteria criteria = example.createCriteria();
		criteria.andOUidEqualTo(cid);
		return ordermapper.selectByExample(example);
	}
	
}
