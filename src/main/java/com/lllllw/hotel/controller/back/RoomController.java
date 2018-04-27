package com.lllllw.hotel.controller.back;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lllllw.hotel.service.RoomService;

@Controller
public class RoomController {

	@Autowired
	private RoomService roomService;
	
	@RequestMapping(value = "/backRoom")
	public String showRoomPage(HttpServletRequest request) {
		request.setAttribute("roomList", roomService.selectAllRoom());
		return "back/room";
	}
}
