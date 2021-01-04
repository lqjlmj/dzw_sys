package com.accp.dao;

import com.accp.pojo.Affiliation;

public interface AffiliationMapper {
    int deleteByPrimaryKey(Integer affiliationid);

    int insert(Affiliation record);

    int insertSelective(Affiliation record);

    Affiliation selectByPrimaryKey(Integer affiliationid);

    int updateByPrimaryKeySelective(Affiliation record);

    int updateByPrimaryKey(Affiliation record);
}