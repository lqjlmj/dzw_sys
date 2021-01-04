package com.accp.dao;

import com.accp.pojo.ServiceItem;

public interface ServiceItemMapper {
    int deleteByPrimaryKey(Integer serviceitemid);

    int insert(ServiceItem record);

    int insertSelective(ServiceItem record);

    ServiceItem selectByPrimaryKey(Integer serviceitemid);

    int updateByPrimaryKeySelective(ServiceItem record);

    int updateByPrimaryKey(ServiceItem record);
}