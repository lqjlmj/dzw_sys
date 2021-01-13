package com.accp.action.lmf;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lmf.VehicleTypeVoBiz;
import com.accp.pojo.VehicleTypeVo;

@CrossOrigin
@RestController
@RequestMapping("/api/vetypelmf")
public class VehicleTypeAction {

	@Autowired
	private VehicleTypeVoBiz vevobiz;
	
	@GetMapping("SelectVehicleTypeAll")
	public Map<String, Object> SelectVehicleTypeAll(){
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("code", "0");
		map.put("count", 10);
		map.put("msg","");
		map.put("data", vevobiz.SelectVehicleTypeAll());
		return map;
		
	}
	

	
	@PostMapping("addinsertSelective")
	public Map<String, String> addinsertSelective(@RequestBody  VehicleTypeVo vehitype) {
		System.out.println(vehitype.getVbrandid());
		vehitype.setVdate(new Date());
		 Map<String, String> message = new HashMap<String, String>();
		 vevobiz.addinsertSelective(vehitype);
		 message.put("code", "200");
		  message.put("msg", "ok");
		return message;
	}
	
	@PostMapping("removedeleteByPrimaryKey/{vtypeid}")
	public int removedeleteByPrimaryKey(@PathVariable Integer vtypeid) {
		return vevobiz.removedeleteByPrimaryKey(vtypeid);
	}
	
	@GetMapping("selectByIdVtypeIdKey")
	public VehicleTypeVo selectByIdVtypeIdKey(Integer vtypeid) {
		return vevobiz.selectByIdVtypeIdKey(vtypeid);
	}
	
	@PostMapping("modifyByPrimaryKeySelective")
	public int modifyByPrimaryKeySelective(@RequestBody VehicleTypeVo vehitype) {
		return vevobiz.modifyByPrimaryKeySelective(vehitype);
	}
	
}
