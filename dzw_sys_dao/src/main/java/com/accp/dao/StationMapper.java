package com.accp.dao;

import com.accp.pojo.Station;

public interface StationMapper {
    int deleteByPrimaryKey(Integer stationid);

    int insert(Station record);

    int insertSelective(Station record);

    Station selectByPrimaryKey(Integer stationid);

    int updateByPrimaryKeySelective(Station record);

    int updateByPrimaryKey(Station record);
}