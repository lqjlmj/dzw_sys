package com.accp.dao;

import com.accp.pojo.Settle;

public interface SettleMapper {
    int deleteByPrimaryKey(Integer settleid);

    int insert(Settle record);

    int insertSelective(Settle record);

    Settle selectByPrimaryKey(Integer settleid);

    int updateByPrimaryKeySelective(Settle record);

    int updateByPrimaryKey(Settle record);
}