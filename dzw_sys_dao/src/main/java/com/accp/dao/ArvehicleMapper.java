package com.accp.dao;

import com.accp.pojo.Arvehicle;

public interface ArvehicleMapper {
    int deleteByPrimaryKey(Integer arvehicleid);

    int insert(Arvehicle record);

    int insertSelective(Arvehicle record);

    Arvehicle selectByPrimaryKey(Integer arvehicleid);

    int updateByPrimaryKeySelective(Arvehicle record);

    int updateByPrimaryKey(Arvehicle record);
}