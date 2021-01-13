package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.EngineType;

public interface EngineTypeMapper {
	
	List<EngineType> seleQueryAllEnginType(@Param("start")Integer start,@Param("limit")Integer limit);
	
	List<EngineType> seleQueryAllEnginTypes();
	
    int removeByPrimaryKey(@Param("enginetypeid") Integer enginetypeid);

    int insert(EngineType record);

    List<EngineType> selectMohuChaEngin(@Param("enginetypename") String enginetypename);
    
    int addSelective(@Param("engtypename") String engtypename);

    EngineType selectByPrimaryKey(Integer enginetypeid);

    int modifyByPrimaryKeySelective(@Param("engtype") EngineType engtype);

    int updateByPrimaryKey(EngineType record);
}