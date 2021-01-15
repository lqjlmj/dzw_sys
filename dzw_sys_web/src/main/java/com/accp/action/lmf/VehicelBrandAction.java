package com.accp.action.lmf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lmf.VehicleBrandBiz;
import com.accp.pojo.VehicleBrand;

@CrossOrigin
@RestController
@RequestMapping("/api/vehlmf")
public class VehicelBrandAction {

	@Autowired
	private VehicleBrandBiz vebiz;
	
	@GetMapping("selectQueryAllVehicle")
	public Map<String, Object> selectQueryAllVehicle(){
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("code", "0");
		map.put("count", 100);
		map.put("msg","");
		map.put("data", vebiz.selectQueryAllVehicle());
		return map;
	}
	
	@PostMapping("removeByPrimaryKey")
	public int reomoveByPrimaryKey(Integer vbrandid) {
		return vebiz.removeByPrimaryKey(vbrandid);
	}
	
	@PostMapping("addinsertVehivo")
	public int addinsertVehivo(String vbrandno, String vbrandname) {
		return vebiz.addinsertVehivo(vbrandno, vbrandname);
	}
	
	@GetMapping("seleQueryByidVehi")
	public VehicleBrand seleQueryByidVehi(String vbrandid) {
		return vebiz.seleQueryByidVehi(vbrandid);
	}
	
	@PostMapping("modifyupdateByPrimaryKeySelective")
	public int modifyupdateByPrimaryKeySelective(String vbrandno,String vbrandname,Integer vbrandid) {
		return vebiz.modifyupdateByPrimaryKeySelective(vbrandno, vbrandname, vbrandid);
	}
	
	@GetMapping("queryAllBrand")
	public List<VehicleBrand> queryAllBrand(){
		return vebiz.selectQueryAllVehicle();
	}
	
}
