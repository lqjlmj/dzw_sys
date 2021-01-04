package com.accp.dao;

import com.accp.pojo.Armember;

public interface ArmemberMapper {
    int deleteByPrimaryKey(Integer armemberid);

    int insert(Armember record);

    int insertSelective(Armember record);

    Armember selectByPrimaryKey(Integer armemberid);

    int updateByPrimaryKeySelective(Armember record);

    int updateByPrimaryKey(Armember record);
}