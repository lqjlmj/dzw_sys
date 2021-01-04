package com.accp.dao;

import com.accp.pojo.SubjoinItem;

public interface SubjoinItemMapper {
    int deleteByPrimaryKey(Integer subjoinitemid);

    int insert(SubjoinItem record);

    int insertSelective(SubjoinItem record);

    SubjoinItem selectByPrimaryKey(Integer subjoinitemid);

    int updateByPrimaryKeySelective(SubjoinItem record);

    int updateByPrimaryKey(SubjoinItem record);
}