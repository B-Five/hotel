package com.lllllw.hotel.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lllllw.hotel.model.Customer;
import com.lllllw.hotel.model.Order;
import com.lllllw.hotel.service.CustomerOrderService;

@Controller
public class CustomerOrderController {
	
	@Autowired
	CustomerOrderService customerOrderService;
	
	@RequestMapping(value = "/customerOrder")
	public String showOrder(HttpServletRequest request,HttpSession session){
		Customer customer = (Customer) session.getAttribute("customer");
		List<Order> orderList = customerOrderService.selectCustomerOrder(customer.getcId());
		request.setAttribute("orderList", orderList);
		return "front/order";
	}
	
}
