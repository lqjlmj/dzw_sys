package com.accp.dao;

import com.accp.pojo.VehicleBrand;

public interface VehicleBrandMapper {
    int deleteByPrimaryKey(Integer vbrandid);

    int insert(VehicleBrand record);

    int insertSelective(VehicleBrand record);

    VehicleBrand selectByPrimaryKey(Integer vbrandid);

    int updateByPrimaryKeySelective(VehicleBrand record);

    int updateByPrimaryKey(VehicleBrand record);
}