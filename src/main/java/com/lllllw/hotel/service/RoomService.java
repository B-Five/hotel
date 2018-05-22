package com.lllllw.hotel.service;

import java.util.List;

import com.lllllw.hotel.dao.RoomTypeMapper;
import com.lllllw.hotel.model.RoomType;
import com.lllllw.hotel.model.RoomTypeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lllllw.hotel.dao.RoomMapper;
import com.lllllw.hotel.model.Room;
import com.lllllw.hotel.model.RoomExample;

@Service
public class RoomService {
	
	@Autowired
	private RoomMapper roomMapper;

	@Autowired
	private RoomTypeMapper roomTypeMapper;
	
	public List<Room> selectAllRoom(){
		RoomExample example = new RoomExample();
		return roomMapper.selectByExample(example);
	}

	public List<RoomType> selectAllRoomType(){
		RoomTypeExample example = new RoomTypeExample();
		return roomTypeMapper.selectByExample(example);
	}
	
}
