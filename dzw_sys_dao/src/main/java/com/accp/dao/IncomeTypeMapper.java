package com.accp.dao;

import com.accp.pojo.IncomeType;

public interface IncomeTypeMapper {
    int deleteByPrimaryKey(Integer incometypeid);

    int insert(IncomeType record);

    int insertSelective(IncomeType record);

    IncomeType selectByPrimaryKey(Integer incometypeid);

    int updateByPrimaryKeySelective(IncomeType record);

    int updateByPrimaryKey(IncomeType record);
}