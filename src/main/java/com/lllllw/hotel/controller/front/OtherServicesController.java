package com.lllllw.hotel.controller.front;

import com.lllllw.hotel.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OtherServicesController {

    @Autowired
    private ServicesService servicesService;

    @RequestMapping("/services")
    public String showOtherServicesPage(Model model){
        model.addAttribute("servicesTypeList",servicesService.searchAllServicesType());
        return "front/services";
    }
}
