package com.lllllw.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lllllw.hotel.dao.CustomerMapper;
import com.lllllw.hotel.model.Customer;
import com.lllllw.hotel.model.CustomerExample;
import com.lllllw.hotel.model.CustomerExample.Criteria;

import java.util.Date;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    public Customer loginCheck(String email, String password) {
        CustomerExample example = new CustomerExample();
        Criteria criteria = example.createCriteria();
        criteria.andCEmailEqualTo(email);
        criteria.andCPasswordEqualTo(password);
        if (!customerMapper.selectByExample(example).isEmpty()) {
            Customer customer = customerMapper.selectByExample(example).get(0);
            customer.setcPassword(null);
            return customer;
        } else
            return null;
    }

    public boolean emailCheck(String email) {
        CustomerExample example = new CustomerExample();
        Criteria criteria = example.createCriteria();
        criteria.andCEmailEqualTo(email);
        return customerMapper.countByExample(example) == 0;
    }

    public boolean createCustomer(Customer customer) {
        Date date = new Date();
        customer.setcCreated(date);
        customer.setcUpdated(date);
        customer.setcGender("先生");
        return customerMapper.insert(customer) == 1;
    }

    public List<Customer> searchAllCustomer() {
        CustomerExample example = new CustomerExample();
        return customerMapper.selectByExample(example);
    }
}
