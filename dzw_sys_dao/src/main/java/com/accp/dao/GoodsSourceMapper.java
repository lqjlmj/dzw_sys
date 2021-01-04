package com.accp.dao;

import com.accp.pojo.GoodsSource;

public interface GoodsSourceMapper {
    int deleteByPrimaryKey(Integer goodsid);

    int insert(GoodsSource record);

    int insertSelective(GoodsSource record);

    GoodsSource selectByPrimaryKey(Integer goodsid);

    int updateByPrimaryKeySelective(GoodsSource record);

    int updateByPrimaryKey(GoodsSource record);
}