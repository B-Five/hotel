package com.lllllw.hotel.controller.front;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lllllw.hotel.model.Customer;
import com.lllllw.hotel.model.RoomType;
import com.lllllw.hotel.service.OrderRoomService;

@Controller
public class OrderRoomController {

	@Autowired
	private OrderRoomService orderRoomService;

	@RequestMapping(value = "/searchPage")
	public String searchRoomType(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws IOException {
		String time = request.getParameter("time");
		if(time == null) {
			time = "";
		}
		Integer member = null;
		List<RoomType> roomTypeList;
		if (request.getParameter("member") != null && !"".equals(request.getParameter("member"))) {
			member = Integer.parseInt(request.getParameter("member"));
			roomTypeList = orderRoomService.selectRoomType(time, member);
		}else {
			roomTypeList = orderRoomService.selectRoomType(time, 0);
		}
		request.setAttribute("roomTypeList", roomTypeList);
		request.setAttribute("time", time);
		request.setAttribute("member", member);
		return "front/search";
	}

	@RequestMapping(value = "/createOrder")
	public void createOrder(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException {
		PrintWriter out = response.getWriter();
		String time = request.getParameter("time");
		int type = Integer.parseInt(request.getParameter("type"));
		Customer customer = (Customer) session.getAttribute("customer");
		int member = 0;
		if (request.getParameter("member") != null && !"".equals(request.getParameter("member"))) {
			member = Integer.parseInt(request.getParameter("member"));
		}
		if (orderRoomService.createOrder(time, type, member, customer.getcId())) {
			out.write("success");
		}else{
			out.write("failure");
		}
	}

}
