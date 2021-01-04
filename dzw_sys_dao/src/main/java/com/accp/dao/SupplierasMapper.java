package com.accp.dao;

import com.accp.pojo.Supplieras;

public interface SupplierasMapper {
    int deleteByPrimaryKey(Integer supplierasid);

    int insert(Supplieras record);

    int insertSelective(Supplieras record);

    Supplieras selectByPrimaryKey(Integer supplierasid);

    int updateByPrimaryKeySelective(Supplieras record);

    int updateByPrimaryKey(Supplieras record);
}