package com.accp.biz.lmf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.VehicleBrandMapper;
import com.accp.pojo.VehicleBrand;

@Service
public class VehicleBrandBiz {

	@Autowired
	private VehicleBrandMapper vehbiz;
	
	/**
	 * 车辆品牌查询全部
	 * @return
	 */
	public List<VehicleBrand> selectQueryAllVehicle(){
		return vehbiz.selectQueryAllVehicle();
	}
	
	/**
	 * 根据vbrandid查询
	 * @return
	 */
	public VehicleBrand seleQueryByidVehi(String vbrandid) {
		return vehbiz.seleQueryByidVehi(vbrandid);
	}
	
	/**
	 * 车辆品牌删除
	 * @param vbrandid
	 * @return
	 */
	public int removeByPrimaryKey(Integer vbrandid) {
		return vehbiz.removeByPrimaryKey(vbrandid);
	}
	
	/**
	 * 车辆品牌的添加
	 * @param vbrandno
	 * @param vbrandname
	 * @return
	 */
	public int addinsertVehivo(String vbrandno , String vbrandname) {
		return vehbiz.addinsertVehivo(vbrandno, vbrandname);
	}
	
	/**
	 * 车辆品牌的修改
	 * @param vbrandno
	 * @param vbrandname
	 * @return
	 */
	public int modifyupdateByPrimaryKeySelective(String vbrandno , String vbrandname , Integer vbrandid) {
		return vehbiz.modifyupdateByPrimaryKeySelective(vbrandno, vbrandname,vbrandid);
	}
}
