package com.accp.biz.lmf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.VehicleTypeMapper;
import com.accp.pojo.VehicleTypeVo;

@Service
public class VehicleTypeVoBiz {

	@Autowired
	private VehicleTypeMapper vetypebiz;
	
	public List<VehicleTypeVo> SelectVehicleTypeAll(){
		return vetypebiz.SelectVehicleTypeAll();
	}
	
	public int addinsertSelective(VehicleTypeVo vehitype) {
		
		return vetypebiz.addinsertSelective(vehitype);
	}
	
	public int removedeleteByPrimaryKey(Integer vtypeid) {
		return vetypebiz.removedeleteByPrimaryKey(vtypeid);
	}
	
	public VehicleTypeVo selectByIdVtypeIdKey(Integer vtypeid) {
		return vetypebiz.selectByIdVtypeIdKey(vtypeid);
	}
	
	public int modifyByPrimaryKeySelective(VehicleTypeVo vehitype) {
		return vetypebiz.modifyByPrimaryKeySelective(vehitype);
	}
}
