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

import com.lllllw.hotel.dao.CustomerMapper;
import com.lllllw.hotel.model.Customer;
import com.lllllw.hotel.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerMapper customerMapper;
	
	@Autowired
	private CustomerService customerService;
	
	/**
	 * 事例方法
	 */
	@RequestMapping(value = "/showName")
	public String showCustomerName(HttpServletRequest request,Model model){
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
	
	@RequestMapping(value = "/loginCheck")
	public void loginCheck(HttpServletRequest request,HttpSession session,HttpServletResponse response,Model model) throws IOException{
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		System.out.println(email);
		String password = request.getParameter("password");
		Customer customer = customerService.loginCheck(email, password);
		if( customer!= null ){
			session.setAttribute("user", customer);
			out.write("success");
		}
		else{
			out.write("success");
		}
	}
	
	@RequestMapping(value = "/loginOut")
	public String loginOut(HttpSession session,Model model){
		session.removeAttribute("user");
		return "front/index";
	}
	
	@RequestMapping(value = "/register")
	public String loginOut(){
		return "front/register";
	}
	

}
