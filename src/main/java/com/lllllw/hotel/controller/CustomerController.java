package com.lllllw.hotel.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lllllw.hotel.dao.CustomerMapper;
import com.lllllw.hotel.model.Customer;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerMapper customerMapper;
	
	@RequestMapping(value = "/showName")
	public String showCustomerName(HttpServletRequest request,Model model){
		System.out.println("ShowCustomerName");
		System.out.println(request.getParameter("cid"));
		int cid = Integer.parseInt(request.getParameter("cid"));
		Customer customer = customerMapper.selectByPrimaryKey(cid);
		if(customer != null){
			request.setAttribute("name", customer.getcName());
			model.addAttribute("name", customer.getcName());
			return "showName";
		}
		request.setAttribute("error", "没有找到该用户");
		return "error";
	}
}
