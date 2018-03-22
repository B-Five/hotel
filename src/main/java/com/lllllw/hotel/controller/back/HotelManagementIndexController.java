package com.lllllw.hotel.controller.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HotelManagementIndexController {

	@RequestMapping(value = "/backIndex")
	public String showIndex() {
		return "back/index";
	}

}
