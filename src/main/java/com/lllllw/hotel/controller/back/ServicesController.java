package com.lllllw.hotel.controller.back;

import com.lllllw.hotel.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServicesController {

    @Autowired
    private ServicesService servicesService;

    @RequestMapping(value = "/backServices")
    public String showServicePage(Model model) {
        model.addAttribute("servicesList", servicesService.searchAllServices());
        return "back/services";
    }

    @RequestMapping(value = "/backServicesType")
    public String showServiceTypePage(Model model) {
        model.addAttribute("servicesTypeList", servicesService.searchAllServicesType());
        return "back/servicesType";
    }

}
