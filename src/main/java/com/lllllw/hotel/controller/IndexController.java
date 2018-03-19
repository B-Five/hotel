package com.lllllw.hotel.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = "/index")
	public String showIndex(HttpServletRequest request,Model model){
		return "front/index";
	}
	
	@RequestMapping(value = "/login")
	public String showLogin(HttpServletRequest request,Model model){
		return "front/login";
	}
	
	@RequestMapping(value = "/register")
	public String loginOut() {
		return "front/register";
	}
	
}
