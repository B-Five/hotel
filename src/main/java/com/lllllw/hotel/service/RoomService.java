package com.lllllw.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lllllw.hotel.dao.RoomMapper;
import com.lllllw.hotel.model.Room;
import com.lllllw.hotel.model.RoomExample;

@Service
public class RoomService {
	
	@Autowired
	private RoomMapper roomMapper;
	
	public List<Room> selectAllRoom(){
		RoomExample example = new RoomExample();
		return roomMapper.selectByExample(example);
	}
	
}
