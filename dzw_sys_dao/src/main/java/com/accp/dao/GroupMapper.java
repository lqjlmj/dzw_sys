package com.accp.dao;

import com.accp.pojo.Group;

public interface GroupMapper {
    int deleteByPrimaryKey(Integer groupid);

    int insert(Group record);

    int insertSelective(Group record);

    Group selectByPrimaryKey(Integer groupid);

    int updateByPrimaryKeySelective(Group record);

    int updateByPrimaryKey(Group record);
}