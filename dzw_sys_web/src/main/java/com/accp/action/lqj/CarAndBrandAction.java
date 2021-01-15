package com.accp.action.lqj;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lqj.CarAndBrandBiz;
import com.accp.vo.CarAndBrand;

@RestController
@RequestMapping("/api/cars")
@CrossOrigin
public class CarAndBrandAction {
	@Autowired
	private CarAndBrandBiz biz;
	
	/**
	 * 分页查询车辆资料
	 * @return
	 */
	@GetMapping
	public Map<String,Object> queryAllCar(){
		Map<String, Object> maps = new Hashtable<>();
		maps.put("code",0);
		maps.put("msg","");
		maps.put("count",biz.queryCount());
		maps.put("data",biz.queryAllCar());
		return maps;
	}
	
	/**
	 * 通过车牌号模糊查询
	 * @param ulicense
	 * @return
	 */
	@RequestMapping("mohu")
	public Map<String,Object> queryAllCarByMoHu(String ulicense){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "0");
		map.put("count", biz.queryCount());
		map.put("msg","");
		map.put("data",biz.queryAllCarByMoHu(ulicense));
		return map;
	}
	
	/**
	 * 根据车辆编号删除对象
	 * @param uvehicleid
	 * @return
	 */
	@RequestMapping("{uvehicleid}")
	public int removeCarById(@PathVariable Integer uvehicleid){
		return biz.removeCarById(uvehicleid);
	}
	
	/**
	 * 新增车辆资料
	 * @param car
	 * @return
	 */
	@RequestMapping("car")
	public Map<String,String> addCar(@RequestBody CarAndBrand car){
		Map<String, String> message = new HashMap<String, String>();
		biz.addCar(car);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@RequestMapping("car/{ulicense}")
	public CarAndBrand queryCarByUlicense(@PathVariable String ulicense){
		return biz.queryCarByUlicense(ulicense);
	}
	
	/**
	 * 修改用户信息
	 * @param record
	 * @return
	 */
	@RequestMapping("record")
	public Map<String,String> modifyUser(@RequestBody CarAndBrand record){
		Map<String, String> message = new HashMap<String, String>();
		biz.modifyCar(record);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
}
