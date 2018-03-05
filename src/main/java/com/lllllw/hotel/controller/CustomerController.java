package com.lllllw.hotel.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lllllw.hotel.model.Customer;
import com.lllllw.hotel.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	/**
	 * 事例方法
	 */
	
	@RequestMapping(value = "/loginCheck")
	public void loginCheck(HttpServletRequest request,HttpSession session,HttpServletResponse response,Model model) throws IOException{
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Customer customer = customerService.loginCheck(email, password);
		if( customer!= null ){
			session.setAttribute("customer", customer);
			out.write("success");
		}
		else{
			out.write("failure");
		}
	}
	
	@RequestMapping(value = "/registerCheck")
	public void registerCheck(HttpServletRequest request,HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		Customer customer = new Customer();
		customer.setcEmail(request.getParameter("email"));
		customer.setcPassword(request.getParameter("password"));
		customer.setcLastname(request.getParameter("lastname"));
		customer.setcFirstname(request.getParameter("firstname"));
		customer.setcPhone(request.getParameter("phone"));
		if(customerService.createCustomer(customer))
			out.write("success");
		else
			out.write("failure");
	}
	
	@RequestMapping(value = "/emailCheck")
	public void emailCheck(HttpServletRequest request,HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		if(customerService.emailCheck(email))
			out.write("success");
		else
			out.write("failure");
	}
	
	@RequestMapping(value = "/loginOut")
	public String loginOut(HttpSession session,Model model){
		session.removeAttribute("customer");
		return "front/index";
	}
	
	@RequestMapping(value = "/register")
	public String loginOut(){
		return "front/register";
	}
	

}
