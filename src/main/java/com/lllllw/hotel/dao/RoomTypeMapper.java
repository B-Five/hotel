package com.lllllw.hotel.dao;

import com.lllllw.hotel.model.RoomType;
import com.lllllw.hotel.model.RoomTypeExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomTypeMapper {
    long countByExample(RoomTypeExample example);

    int deleteByExample(RoomTypeExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(RoomType record);

    int insertSelective(RoomType record);

    List<RoomType> selectByExample(RoomTypeExample example);

    RoomType selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") RoomType record, @Param("example") RoomTypeExample example);

    int updateByExample(@Param("record") RoomType record, @Param("example") RoomTypeExample example);

    int updateByPrimaryKeySelective(RoomType record);

    int updateByPrimaryKey(RoomType record);
    
    List<RoomType> selectByDate(@Param("start")Date start,@Param("end")Date end,@Param("member")int member);
}