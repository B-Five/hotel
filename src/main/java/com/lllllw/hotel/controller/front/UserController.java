package com.lllllw.hotel.controller.front;

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
public class UserController {

	@Autowired
	private CustomerService customerService;

	/**
	 * 登录验证
	 */
	@RequestMapping(value = "/loginCheck")
	public void loginCheck(HttpServletRequest request, HttpSession session, HttpServletResponse response, Model model)
			throws IOException {
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Customer customer = customerService.loginCheck(email, password);
		if (customer != null) {
			session.setAttribute("customer", customer);
			out.write("success");
		} else {
			out.write("failure");
		}
	}

	/**
	 * 注册验证
	 * 
	 */
	@RequestMapping(value = "/registerCheck")
	public void registerCheck(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		Customer customer = new Customer();
		customer.setcEmail(request.getParameter("email"));
		customer.setcPassword(request.getParameter("password"));
		customer.setcLastname(request.getParameter("lastname"));
		customer.setcFirstname(request.getParameter("firstname"));
		customer.setcPhone(request.getParameter("phone"));
		if (customerService.createCustomer(customer))
			out.write("success");
		else
			out.write("failure");
	}

	@RequestMapping(value = "/emailCheck")
	public void emailCheck(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		if (customerService.emailCheck(email))
			out.write("success");
		else
			out.write("failure");
	}

	@RequestMapping(value = "/logOut")
	public String loginOut(HttpSession session, Model model) {
		session.removeAttribute("customer");
		return "front/index";
	}


	/*@RequestMapping(value = "/search")
	public void searchOrderRoom(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws IOException {
		PrintWriter out = response.getWriter();
		String time = request.getParameter("time");
		String member = request.getParameter("member");
		session.setAttribute("time", time);
		session.setAttribute("member", member);
		out.write("success");
	}*/

	

}
