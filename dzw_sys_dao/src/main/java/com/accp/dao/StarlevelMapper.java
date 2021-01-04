package com.accp.dao;

import com.accp.pojo.Starlevel;

public interface StarlevelMapper {
    int deleteByPrimaryKey(Integer starid);

    int insert(Starlevel record);

    int insertSelective(Starlevel record);

    Starlevel selectByPrimaryKey(Integer starid);

    int updateByPrimaryKeySelective(Starlevel record);

    int updateByPrimaryKey(Starlevel record);
}