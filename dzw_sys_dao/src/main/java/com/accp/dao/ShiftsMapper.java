package com.accp.dao;

import com.accp.pojo.Shifts;

public interface ShiftsMapper {
    int deleteByPrimaryKey(Integer shifstid);

    int insert(Shifts record);

    int insertSelective(Shifts record);

    Shifts selectByPrimaryKey(Integer shifstid);

    int updateByPrimaryKeySelective(Shifts record);

    int updateByPrimaryKey(Shifts record);
}