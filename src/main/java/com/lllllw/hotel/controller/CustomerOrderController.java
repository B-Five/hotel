package com.lllllw.hotel.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
	private CustomerOrderService customerOrderService;

	@RequestMapping(value = "/showCustomerOrder")
	public String showOrder(HttpServletRequest request, HttpSession session) {
		Customer customer = (Customer) session.getAttribute("customer");
		List<Order> orderList = customerOrderService.selectCustomerOrder(customer.getcId());
		request.setAttribute("orderList", orderList);
		return "front/order";
	}

	@RequestMapping(value = "/deleteCustomerOrder")
	public void deleteOrder(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		int oId = Integer.parseInt(request.getParameter("oId"));
		if (customerOrderService.deleteCustomerOrder(oId))
			out.write("success");
		else
			out.write("failure");
	}

	@RequestMapping(value = "/checkInCustomerOrder")
	public void checkIn(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		int oId = Integer.parseInt(request.getParameter("oId"));
		out.write(customerOrderService.checkin(oId));
	}


}
