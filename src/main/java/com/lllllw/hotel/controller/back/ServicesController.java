package com.lllllw.hotel.controller.back;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServicesController {

    @RequestMapping(value = "/backServices")
    public String showRoomPage(Model model) {
        model.addAttribute("roomList", roomService.selectAllRoom());
        return "back/services";
    }

    @RequestMapping(value = "/backServicesType")
    public String showRoomPage(Model model) {
        model.addAttribute("roomList", roomService.selectAllRoom());
        return "back/servicesType";
    }

}
