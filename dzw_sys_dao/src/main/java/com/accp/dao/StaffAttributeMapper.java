package com.accp.dao;

import com.accp.pojo.StaffAttribute;

public interface StaffAttributeMapper {
    int deleteByPrimaryKey(Integer staffaeid);

    int insert(StaffAttribute record);

    int insertSelective(StaffAttribute record);

    StaffAttribute selectByPrimaryKey(Integer staffaeid);

    int updateByPrimaryKeySelective(StaffAttribute record);

    int updateByPrimaryKey(StaffAttribute record);
}