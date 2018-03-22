package com.lllllw.hotel.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lllllw.hotel.dao.OrderMapper;
import com.lllllw.hotel.dao.RoomMapper;
import com.lllllw.hotel.model.Order;
import com.lllllw.hotel.model.OrderExample;
import com.lllllw.hotel.model.OrderExample.Criteria;
import com.lllllw.hotel.model.Room;
import com.lllllw.hotel.utils.HotelUtil;

/**
 * 客户订单页面
 *
 */
@Service
public class CustomerOrderService {

	@Autowired
	private OrderMapper orderMapper;

	@Autowired
	private RoomMapper roomMapper;

	@Autowired
	private HotelUtil hotelUtil;

	/**
	 * 查询一个客户的所有订单
	 * @param cid 客户ID
	 */
	public List<Order> selectCustomerOrder(int cId){
		OrderExample example = new OrderExample();
		Criteria criteria = example.createCriteria();
		criteria.andOUidEqualTo(cId);
		return orderMapper.selectByExample(example);
	}

	/**
	 * 取消订单
	 * @param oId 订单ID
	 */
	public boolean deleteCustomerOrder(int oId){
		return orderMapper.deleteByPrimaryKey(oId) ==1;
	}

	public String checkIn(int oId) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Order order = orderMapper.selectByPrimaryKey(oId);
		Date nowTime = new Date();
		if(sdf.format(nowTime).equals(sdf.format(order.getoCheckintime()))) {
			System.out.println("666");
			Room room = new Room();
			room.setrId(order.getoRid());
			room.setrUpdated(nowTime);
			room.setrOrder(order.getoId());
			roomMapper.updateByPrimaryKeySelective(room);
			order.setoStringfield2(hotelUtil.getRandomString(6));
			order.setoBoolfield1(true);
			order.setoUpdated(nowTime);
			orderMapper.updateByPrimaryKey(order);
			return order.getoStringfield2();
		}else {
			return "failure";
		}
	}

	public String checkOut(int oId) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Order order = orderMapper.selectByPrimaryKey(oId);
		Date nowTime = new Date();
		if(sdf.format(nowTime).equals(sdf.format(order.getoCheckouttime()))) {
			Room room = roomMapper.selectByPrimaryKey(order.getoRid());
			room.setrOrder(null);
			room.setrUpdated(nowTime);
			roomMapper.updateByPrimaryKey(room);
			order.setoStringfield2(null);
			order.setoStatus(true);
			order.setoUpdated(nowTime);
			orderMapper.updateByPrimaryKey(order);
			return order.getoPrice().toString();
		}else {
			return "failure";
		}
	}

}
