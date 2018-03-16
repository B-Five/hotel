package com.lllllw.hotel.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
		Date start = null;
		Date end = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if (!"入住日期".equals(timeArray[0].trim())) {
			try {
				start = sdf.parse(timeArray[0].trim());
				end = sdf.parse(timeArray[0].trim());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return roomTypeMapper.selectByDate(start, end, member);
	}
}
