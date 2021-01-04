package com.accp.dao;

import com.accp.pojo.Oilmass;

public interface OilmassMapper {
    int deleteByPrimaryKey(Integer oilmassid);

    int insert(Oilmass record);

    int insertSelective(Oilmass record);

    Oilmass selectByPrimaryKey(Integer oilmassid);

    int updateByPrimaryKeySelective(Oilmass record);

    int updateByPrimaryKey(Oilmass record);
}