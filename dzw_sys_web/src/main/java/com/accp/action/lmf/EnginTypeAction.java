package com.accp.action.lmf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lmf.EnginTypeBiz;
import com.accp.pojo.EngineType;
import com.alibaba.fastjson.JSON;

@RestController
@RequestMapping("/api/lmf")
@CrossOrigin
public class EnginTypeAction {

	@Autowired
	private EnginTypeBiz enbiz;
	
	@GetMapping("seleQueryAllEnginType")
	public Map<String, Object> seleQueryAllEnginType(Integer page,Integer limit){
		int start = page * limit - limit;
		System.out.println(start);
		System.out.println(page);
		System.out.println(limit);
		Map<String, Object> map = new HashMap<String, Object>();
		 
		map.put("code", "0");
		map.put("count", 20);
		map.put("msg","");
		map.put("data", enbiz.seleQueryAllEnginType(start,limit));
		
		return map;
	}
	
	
	@GetMapping("seleQueryAllEnginTypes")
	public List<EngineType> seleQueryAllEnginTypes(){
		return enbiz.seleQueryAllEnginTypes();
	}
	
	
	
	@PostMapping("removeByPrimaryKey")
	public int removeByPrimaryKey(String jsonStr) {
		System.err.println(jsonStr);
		List<EngineType> t=JSON.parseArray(jsonStr, EngineType.class);
		return enbiz.removeByPrimaryKey(t);
	}
	
	@PutMapping("modifyByPrimaryKeySelective")
	public int modifyByPrimaryKeySelective(@RequestBody EngineType engtype) {
		return enbiz.modifyByPrimaryKeySelective(engtype);
	}
	
	@PostMapping("addSelective")
	public int addSelective(String jsonStr) {
		/*
		 * System.err.println(jsonStr); EngineType
		 * t=JSON.parseObject(jsonStr,EngineType.class);
		 */
		return enbiz.addSelective(jsonStr);
	}
	
	@GetMapping("selectMohuChaEngin")
	public Map<String, Object> selectMohuChaEngin(String jsonStr){
		Map<String, Object> map = new HashMap<String, Object>();
		 
		map.put("code", "0");
		map.put("count", 1);
		map.put("msg","");
		map.put("data", enbiz.selectMohuChaEngin(jsonStr));
		
		return map;
	}
	
}
