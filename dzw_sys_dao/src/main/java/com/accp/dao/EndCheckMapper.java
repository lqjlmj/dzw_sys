package com.accp.dao;

import com.accp.pojo.EndCheck;

public interface EndCheckMapper {
    int deleteByPrimaryKey(Integer endcheckid);

    int insert(EndCheck record);

    int insertSelective(EndCheck record);

    EndCheck selectByPrimaryKey(Integer endcheckid);

    int updateByPrimaryKeySelective(EndCheck record);

    int updateByPrimaryKey(EndCheck record);
}