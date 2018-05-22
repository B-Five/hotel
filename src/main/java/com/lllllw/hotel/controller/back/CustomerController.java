package com.lllllw.hotel.controller.back;

import com.lllllw.hotel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/backCustomer")
    public String showCustomerPage(Model model) {
        model.addAttribute("customerList",customerService.searchAllCustomer());
        return "back/customer";
    }
}
