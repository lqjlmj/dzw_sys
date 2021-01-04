package com.accp.dao;

import com.accp.pojo.Statistics;

public interface StatisticsMapper {
    int deleteByPrimaryKey(Integer stid);

    int insert(Statistics record);

    int insertSelective(Statistics record);

    Statistics selectByPrimaryKey(Integer stid);

    int updateByPrimaryKeySelective(Statistics record);

    int updateByPrimaryKey(Statistics record);
}