package com.accp.dao;

import com.accp.pojo.Billsettle;

public interface BillsettleMapper {
    int deleteByPrimaryKey(Integer billsettleid);

    int insert(Billsettle record);

    int insertSelective(Billsettle record);

    Billsettle selectByPrimaryKey(Integer billsettleid);

    int updateByPrimaryKeySelective(Billsettle record);

    int updateByPrimaryKey(Billsettle record);
}