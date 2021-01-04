package com.accp.dao;

import com.accp.pojo.Artisans;

public interface ArtisansMapper {
    int deleteByPrimaryKey(Integer artisansid);

    int insert(Artisans record);

    int insertSelective(Artisans record);

    Artisans selectByPrimaryKey(Integer artisansid);

    int updateByPrimaryKeySelective(Artisans record);

    int updateByPrimaryKey(Artisans record);
}