package com.lllllw.hotel.controller.back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lllllw.hotel.service.RoomService;

@Controller
public class RoomController {

	@Autowired
	private RoomService roomService;
	
	@RequestMapping(value = "/backRoom")
	public String showRoomPage(Model model) {
		model.addAttribute("roomList", roomService.selectAllRoom());
		return "back/room";
	}
}
