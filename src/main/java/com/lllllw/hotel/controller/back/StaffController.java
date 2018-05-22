package com.lllllw.hotel.controller.back;

import com.lllllw.hotel.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaffController {

    @Autowired
    private StaffService staffService;

    @RequestMapping(value = "/backStaff")
    public String showRoomPage(Model model) {
        model.addAttribute("staffList", staffService.searchAllStaff());
        return "back/staff";
    }

}
