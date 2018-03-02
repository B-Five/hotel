package com.lllllw.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lllllw.hotel.dao.CustomerMapper;
import com.lllllw.hotel.model.Customer;
import com.lllllw.hotel.model.CustomerExample;
import com.lllllw.hotel.model.CustomerExample.Criteria;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerMapper customerMapper;
	
	public Customer loginCheck(String email,String password){
		CustomerExample example = new CustomerExample();
		Criteria criteria =  example.createCriteria();
		criteria.andCEmailEqualTo(email);
		criteria.andCPasswordEqualTo(password);
		Customer customer = customerMapper.selectByExample(example).get(0);
		if(customer != null)
			return customer;
		else
			return null;
	}
}
