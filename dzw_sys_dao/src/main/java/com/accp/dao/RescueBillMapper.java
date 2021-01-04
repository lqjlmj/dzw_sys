package com.accp.dao;

import com.accp.pojo.RescueBill;

public interface RescueBillMapper {
    int deleteByPrimaryKey(Integer rescuebillid);

    int insert(RescueBill record);

    int insertSelective(RescueBill record);

    RescueBill selectByPrimaryKey(Integer rescuebillid);

    int updateByPrimaryKeySelective(RescueBill record);

    int updateByPrimaryKey(RescueBill record);
}