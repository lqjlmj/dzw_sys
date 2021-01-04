package com.accp.dao;

import com.accp.pojo.Dimissiontext;

public interface DimissiontextMapper {
    int deleteByPrimaryKey(Integer dimissionid);

    int insert(Dimissiontext record);

    int insertSelective(Dimissiontext record);

    Dimissiontext selectByPrimaryKey(Integer dimissionid);

    int updateByPrimaryKeySelective(Dimissiontext record);

    int updateByPrimaryKey(Dimissiontext record);
}