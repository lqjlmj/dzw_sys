package com.accp.dao;

import com.accp.pojo.EngineType;

public interface EngineTypeMapper {
    int deleteByPrimaryKey(Integer enginetypeid);

    int insert(EngineType record);

    int insertSelective(EngineType record);

    EngineType selectByPrimaryKey(Integer enginetypeid);

    int updateByPrimaryKeySelective(EngineType record);

    int updateByPrimaryKey(EngineType record);
}