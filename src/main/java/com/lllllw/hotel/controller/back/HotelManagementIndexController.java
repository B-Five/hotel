package com.lllllw.hotel.controller.back;

import com.lllllw.hotel.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class HotelManagementIndexController {

    @Autowired
    private StaffService staffService;

	@RequestMapping(value = "/backIndex")
	public String showIndex() {
		return "back/index";
	}

	@RequestMapping(value = "/backLogin")
	public String showLogin(){
		return "back/login";
	}

	@RequestMapping(value = "/backLoginCheck")
	public String backLoginCheck(@RequestParam("staffCode") String staffCode,@RequestParam("password")String password,HttpSession session){
        if(staffService.loginCheck(staffCode,password)) {
            session.setAttribute("staffCode",staffCode);
            return "redirect:backIndex";
        }
        else{
            return "redirect:backLogin";
        }
	}

}
