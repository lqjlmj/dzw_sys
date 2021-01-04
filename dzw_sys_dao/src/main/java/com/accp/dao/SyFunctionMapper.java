package com.accp.dao;

import com.accp.pojo.SyFunction;

public interface SyFunctionMapper {
    int deleteByPrimaryKey(Integer syfunctionid);

    int insert(SyFunction record);

    int insertSelective(SyFunction record);

    SyFunction selectByPrimaryKey(Integer syfunctionid);

    int updateByPrimaryKeySelective(SyFunction record);

    int updateByPrimaryKey(SyFunction record);
}