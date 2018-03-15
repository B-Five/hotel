package com.lllllw.hotel.dao;

import com.lllllw.hotel.model.ServicesTypeExample;
import com.lllllw.hotel.model.ServicesType;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicesTypeMapper {
    long countByExample(ServicesTypeExample example);

    int deleteByExample(ServicesTypeExample example);

    int deleteByPrimaryKey(Integer stId);

    int insert(ServicesType record);

    int insertSelective(ServicesType record);

    List<ServicesType> selectByExample(ServicesTypeExample example);

    ServicesType selectByPrimaryKey(Integer stId);

    int updateByExampleSelective(@Param("record") ServicesType record, @Param("example") ServicesTypeExample example);

    int updateByExample(@Param("record") ServicesType record, @Param("example") ServicesTypeExample example);

    int updateByPrimaryKeySelective(ServicesType record);

    int updateByPrimaryKey(ServicesType record);
}