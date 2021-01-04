package com.accp.dao;

import com.accp.pojo.ServiceItemType;

public interface ServiceItemTypeMapper {
    int deleteByPrimaryKey(Integer serviceitid);

    int insert(ServiceItemType record);

    int insertSelective(ServiceItemType record);

    ServiceItemType selectByPrimaryKey(Integer serviceitid);

    int updateByPrimaryKeySelective(ServiceItemType record);

    int updateByPrimaryKey(ServiceItemType record);
}