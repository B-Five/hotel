package com.lllllw.hotel.controller.back;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

    @RequestMapping(value = "/backOrder")
    public String showRoomPage(Model model) {
        model.addAttribute("roomList", roomService.selectAllRoom());
        return "back/order";
    }




}
