package com.lllllw.hotel.service;

import java.util.ArrayList;
import java.util.List;

import com.lllllw.hotel.dao.OrderMapper;
import com.lllllw.hotel.model.Order;
import com.lllllw.hotel.model.OrderExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lllllw.hotel.model.Room;

@Service
public class OrderService {

	@Autowired
	private OrderMapper orderMapper;

	public List<Order> searchAllOrder(){
		OrderExample example = new OrderExample();
		return orderMapper.selectByExample(example);
	}

	public ArrayList<Room> searchOrderRoom(String time,int num){
		return null;
	}


}
