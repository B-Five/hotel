package com.lllllw.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lllllw.hotel.dao.RoomTypeMapper;
import com.lllllw.hotel.model.RoomType;

@Service
public class OrderRoomService {
	@Autowired
	RoomTypeMapper roomTypeMapper;

	public List<RoomType> selectRoomType(String time, int member) {
		String[] timeArray = time.split("to");
		if ("入住日期".equals(timeArray[0].trim())){
			timeArray[0] = "null";
			timeArray[1] = "null";
		}
			return roomTypeMapper.selectByDate(timeArray[0].trim(), timeArray[1].trim(), member);
	}
}
