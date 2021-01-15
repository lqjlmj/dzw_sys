package com.accp.biz.lqj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.CarAndBrandMapper;
import com.accp.vo.CarAndBrand;

@Service
public class CarAndBrandBiz {
	@Autowired
	private CarAndBrandMapper dao;
	
	/**
	 * 查询车辆资料
	 * @return
	 */
	public List<CarAndBrand> queryAllCar(){
		return dao.queryAllCarAndBrand();
	}
	
	/**
	 * 查询总条数
	 * @return
	 */
	public int queryCount() {
		return dao.queryCount();
	}
	
	/**
	 * 通过车牌号模糊查询
	 * @return
	 */
	public List<CarAndBrand> queryAllCarByMoHu(String ulicense){
		return dao.queryAllCarByMoHu(ulicense);
	}
	
	/**
	 * 通过车辆编号删除对象
	 * @param uvehicleid
	 * @return
	 */
	public int removeCarById(Integer uvehicleid) {
		return dao.removeCarById(uvehicleid);
	}
	
	/**
	 * 新增车辆资料
	 * @param car
	 * @return
	 */
	public int addCar(CarAndBrand car){
		return dao.addCar(car);
	}
	
	/**
	 * 通过车牌号查询对象
	 * @param ulicense
	 * @return
	 */
	public CarAndBrand queryCarByUlicense(String ulicense){
		return dao.queryCarByUlicense(ulicense);
	}
	
	/**
	 * 通过车牌号修改对象
	 * @param record
	 * @return
	 */
	public int modifyCar(CarAndBrand record){
		return dao.modifyCarByUlicense(record);
	}
	
}
