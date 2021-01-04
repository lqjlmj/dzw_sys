package com.accp.dao;

import com.accp.pojo.VehicleType;

public interface VehicleTypeMapper {
    int deleteByPrimaryKey(Integer vtypeid);

    int insert(VehicleType record);

    int insertSelective(VehicleType record);

    VehicleType selectByPrimaryKey(Integer vtypeid);

    int updateByPrimaryKeySelective(VehicleType record);

    int updateByPrimaryKey(VehicleType record);
}