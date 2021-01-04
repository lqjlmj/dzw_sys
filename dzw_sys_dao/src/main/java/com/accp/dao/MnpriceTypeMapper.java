package com.accp.dao;

import com.accp.pojo.MnpriceType;

public interface MnpriceTypeMapper {
    int deleteByPrimaryKey(Integer mnpricetypeid);

    int insert(MnpriceType record);

    int insertSelective(MnpriceType record);

    MnpriceType selectByPrimaryKey(Integer mnpricetypeid);

    int updateByPrimaryKeySelective(MnpriceType record);

    int updateByPrimaryKey(MnpriceType record);
}