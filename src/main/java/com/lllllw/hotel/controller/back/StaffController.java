package com.lllllw.hotel.controller.back;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaffController {

    @RequestMapping(value = "/backStaff")
    public String showRoomPage(Model model) {
        model.addAttribute("roomList", roomService.selectAllRoom());
        return "back/staff";
    }

}
