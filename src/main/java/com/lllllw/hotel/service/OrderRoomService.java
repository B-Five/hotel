package com.lllllw.hotel.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lllllw.hotel.dao.OrderMapper;
import com.lllllw.hotel.dao.RoomMapper;
import com.lllllw.hotel.dao.RoomTypeMapper;
import com.lllllw.hotel.model.Order;
import com.lllllw.hotel.model.Room;
import com.lllllw.hotel.model.RoomType;

@Service
public class OrderRoomService {
	@Autowired
	RoomTypeMapper roomTypeMapper;
	
	@Autowired
	RoomMapper roomMapper;
	
	@Autowired
	OrderMapper orderMapper;

	public List<RoomType> selectRoomType(String time, int member) {
		String[] timeArray = time.split("to");
		Date start = null;
		Date end = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if (!"入住日期".equals(timeArray[0].trim())) {
			try {
				start = sdf.parse(timeArray[0].trim());
				end = sdf.parse(timeArray[0].trim());
			} catch (ParseException e) {
				e.printStackTrace();
			}

		}
		return roomTypeMapper.selectByDate(start, end, member);
	}
	
	public boolean createOrder(String time,int type,int member,int customer){
		String[] timeArray = time.split("to");
		Date start = null;
		Date end = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if (!"入住日期".equals(timeArray[0].trim())) {
			try {
				start = sdf.parse(timeArray[0].trim());
				end = sdf.parse(timeArray[0].trim());
			} catch (ParseException e) {
				e.printStackTrace();
			}

		}
		Room room = roomMapper.selectByDate(start, end, type, member);
		Order order = new Order();
		Date nowTime = new Date();
		order.setoUid(customer);
		order.setoRid(room.getrId());
		order.setoCheckintime(start);
		order.setoCheckouttime(end);
		order.setoPrice(room.getrPrice());
		order.setoCreated(nowTime);
		order.setoUpdated(nowTime);
		System.out.println(orderMapper.insert(order));
		return true;
	}
	
}
