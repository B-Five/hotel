package com.lllllw.hotel.dao;

import com.lllllw.hotel.model.Services;
import com.lllllw.hotel.model.ServicesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicesMapper {
    long countByExample(ServicesExample example);

    int deleteByExample(ServicesExample example);

    int deleteByPrimaryKey(Integer seId);

    int insert(Services record);

    int insertSelective(Services record);

    List<Services> selectByExample(ServicesExample example);

    Services selectByPrimaryKey(Integer seId);

    int updateByExampleSelective(@Param("record") Services record, @Param("example") ServicesExample example);

    int updateByExample(@Param("record") Services record, @Param("example") ServicesExample example);

    int updateByPrimaryKeySelective(Services record);

    int updateByPrimaryKey(Services record);
}