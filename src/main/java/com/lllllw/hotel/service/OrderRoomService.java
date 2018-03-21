package com.lllllw.hotel.service;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lllllw.hotel.dao.OrderMapper;
import com.lllllw.hotel.dao.RoomMapper;
import com.lllllw.hotel.dao.RoomTypeMapper;
import com.lllllw.hotel.model.Order;
import com.lllllw.hotel.model.Room;
import com.lllllw.hotel.model.RoomType;
import com.lllllw.hotel.model.RoomTypeExample;
import com.lllllw.hotel.model.RoomTypeExample.Criteria;
import com.lllllw.hotel.utils.HotelUtil;

/**
 * 查找房间页面
 *
 */
@Service
public class OrderRoomService {
	@Autowired
	private RoomTypeMapper roomTypeMapper;

	@Autowired
	private RoomMapper roomMapper;

	@Autowired
	private OrderMapper orderMapper;

	@Autowired
	private HotelUtil hotelUtil;

	public List<RoomType> selectRoomType(String time, int member) {
		String[] timeArray = time.split("to");
		Date start = null;
		Date end = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if (!"".equals(timeArray[0].trim()) && !"入住日期".equals(timeArray[0].trim())) {
			try {
				start = sdf.parse(timeArray[0].trim());
				end = sdf.parse(timeArray[1].trim());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return roomTypeMapper.selectByDate(start, end, member);
		} else {
			RoomTypeExample example = new RoomTypeExample();
			Criteria criteria = example.createCriteria();
			criteria.andTIdIsNotNull();
			return roomTypeMapper.selectByExample(example);
		}
	}

	public boolean createOrder(String time, int type, int member, int customer) {
		String[] timeArray = time.split("to");
		Date start = null;
		Date end = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if (!"入住日期".equals(timeArray[0].trim())) {
			try {
				start = sdf.parse(timeArray[0].trim());
				end = sdf.parse(timeArray[1].trim());
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
		order.setoDeposit(room.getrPrice());
		order.setoPrice(room.getrPrice() * hotelUtil.getDays(start, end));
		order.setoCreated(nowTime);
		order.setoUpdated(nowTime);
		order.setoIntfield1(room.getrNumber());
		order.setoStringfield1(room.getrStringfield1());
		return orderMapper.insert(order) == 1;
	}

}
