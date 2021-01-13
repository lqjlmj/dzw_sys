package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.VehicleType;
import com.accp.pojo.VehicleTypeVo;

public interface VehicleTypeMapper {
	
	List<VehicleTypeVo> SelectVehicleTypeAll();
	
	int removedeleteByPrimaryKey(@Param("vtypeid") Integer vtypeid);
	
	VehicleTypeVo selectByIdVtypeIdKey(@Param("vtypeid") Integer vtypeid);
	
	int modifyByPrimaryKeySelective(@Param("vehitype") VehicleTypeVo vehitype);
	
    int deleteByPrimaryKey(Integer vtypeid);

    int insert(VehicleType record);

    int addinsertSelective(@Param("vehitype") VehicleTypeVo vehitype);

    VehicleType selectByPrimaryKey(Integer vtypeid);

    int updateByPrimaryKeySelective(VehicleType record);

    int updateByPrimaryKey(VehicleType record);
}