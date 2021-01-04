package com.accp.dao;

import com.accp.pojo.Clearingform;

public interface ClearingformMapper {
    int deleteByPrimaryKey(Integer clearingformid);

    int insert(Clearingform record);

    int insertSelective(Clearingform record);

    Clearingform selectByPrimaryKey(Integer clearingformid);

    int updateByPrimaryKeySelective(Clearingform record);

    int updateByPrimaryKey(Clearingform record);
}