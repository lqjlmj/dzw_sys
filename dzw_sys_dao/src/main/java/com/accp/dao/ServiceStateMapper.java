package com.accp.dao;

import com.accp.pojo.ServiceState;

public interface ServiceStateMapper {
    int deleteByPrimaryKey(Integer servicestateid);

    int insert(ServiceState record);

    int insertSelective(ServiceState record);

    ServiceState selectByPrimaryKey(Integer servicestateid);

    int updateByPrimaryKeySelective(ServiceState record);

    int updateByPrimaryKey(ServiceState record);
}