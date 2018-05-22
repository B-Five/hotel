package com.lllllw.hotel.controller.back;

import com.lllllw.hotel.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/backOrder")
    public String showOrderPage(Model model) {
        model.addAttribute("orderList", orderService.searchAllOrder());
        return "back/order";
    }






}
