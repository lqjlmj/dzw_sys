package com.accp.dao;

import com.accp.pojo.QxConnect;

public interface QxConnectMapper {
    int deleteByPrimaryKey(Integer qxconnectid);

    int insert(QxConnect record);

    int insertSelective(QxConnect record);

    QxConnect selectByPrimaryKey(Integer qxconnectid);

    int updateByPrimaryKeySelective(QxConnect record);

    int updateByPrimaryKey(QxConnect record);
}