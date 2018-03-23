package com.lllllw.hotel.controller.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoomController {

	@RequestMapping(value = "/backRoom")
	public String showRoomPage() {
		return "back/room";
	}
}
