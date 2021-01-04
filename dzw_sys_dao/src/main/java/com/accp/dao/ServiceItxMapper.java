package com.accp.dao;

import com.accp.pojo.ServiceItx;

public interface ServiceItxMapper {
    int deleteByPrimaryKey(Integer serviceitxid);

    int insert(ServiceItx record);

    int insertSelective(ServiceItx record);

    ServiceItx selectByPrimaryKey(Integer serviceitxid);

    int updateByPrimaryKeySelective(ServiceItx record);

    int updateByPrimaryKey(ServiceItx record);
}