package com.accp.dao;

import com.accp.pojo.TbeType;

public interface TbeTypeMapper {
    int deleteByPrimaryKey(Integer etypeid);

    int insert(TbeType record);

    int insertSelective(TbeType record);

    TbeType selectByPrimaryKey(Integer etypeid);

    int updateByPrimaryKeySelective(TbeType record);

    int updateByPrimaryKey(TbeType record);
}