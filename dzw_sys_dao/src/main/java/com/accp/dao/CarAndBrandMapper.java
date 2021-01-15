package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.vo.CarAndBrand;

public interface CarAndBrandMapper {
	/**
	 * 查询车辆和车品牌
	 * @return
	 */
	List<CarAndBrand> queryAllCarAndBrand();
	
	/**
	 * 查询总条数
	 * @return
	 */
	int queryCount();
	
	/**
	 * 通过车牌号模糊查询
	 * @return
	 */
	List<CarAndBrand> queryAllCarByMoHu(@Param("ulicense")String ulicense);
	
	/**
	 * 根据车辆编号删除对象
	 * @return
	 */
	int removeCarById(@Param("uvehicleid")Integer uvehicleid);
	
	/**
	 * 新增车辆资料
	 * @param car
	 * @return
	 */
	int addCar(@Param("car")CarAndBrand car);
	
	/**
	 * 通过车牌号查询对象
	 * @param ulicense
	 * @return
	 */
	CarAndBrand queryCarByUlicense(@Param("ulicense")String ulicense);
	
	/**
	 * 通过车牌号修改对象
	 * @param record
	 * @return
	 */
	int modifyCarByUlicense(@Param("record")CarAndBrand record);
	
}
