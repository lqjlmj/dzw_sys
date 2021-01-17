package com.accp.dao;

import java.util.List;

import com.accp.pojo.Station;

public interface StationMapper {
    int deleteByPrimaryKey(Integer stationid);

    int insertStation(Station record);

    List<Station> selectStationAll();

}