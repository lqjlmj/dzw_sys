package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.VehicleBrand;

public interface VehicleBrandMapper {
    int removeByPrimaryKey(@Param("vbrandid") Integer vbrandid);

    List<VehicleBrand> selectQueryAllVehicle();
    
    VehicleBrand seleQueryByidVehi(@Param("vbrandid") String vbrandid);
    
    int insert(VehicleBrand record);

    int addinsertVehivo(@Param("vbrandno") String vbrandno , @Param("vbrandname") String vbrandname);

    VehicleBrand selectByPrimaryKey(Integer vbrandid);

    int modifyupdateByPrimaryKeySelective(@Param("vbrandno") String vbrandno , @Param("vbrandname") String vbrandname , @Param("vbrandid") Integer vbrandid);

    int updateByPrimaryKey(VehicleBrand record);
}