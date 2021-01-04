package com.accp.dao;

import com.accp.pojo.RbProject;

public interface RbProjectMapper {
    int deleteByPrimaryKey(Integer rbprojectid);

    int insert(RbProject record);

    int insertSelective(RbProject record);

    RbProject selectByPrimaryKey(Integer rbprojectid);

    int updateByPrimaryKeySelective(RbProject record);

    int updateByPrimaryKey(RbProject record);
}