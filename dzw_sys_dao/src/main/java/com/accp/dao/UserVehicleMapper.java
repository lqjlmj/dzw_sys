package com.accp.dao;

import com.accp.pojo.UserVehicle;

public interface UserVehicleMapper {
    int deleteByPrimaryKey(Integer uvehicleid);

    int insert(UserVehicle record);

    int insertSelective(UserVehicle record);

    UserVehicle selectByPrimaryKey(Integer uvehicleid);

    int updateByPrimaryKeySelective(UserVehicle record);

    int updateByPrimaryKey(UserVehicle record);
}