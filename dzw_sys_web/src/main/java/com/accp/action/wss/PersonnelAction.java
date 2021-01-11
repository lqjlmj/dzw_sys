package com.accp.action.wss;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.wss.PersonnelBiz;
import com.accp.pojo.Starlevel;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/wss")
public class PersonnelAction {
	@Autowired
	private PersonnelBiz biz;
	
	@GetMapping("queryStarAll")
	public Map<String,Object> queryStarAll(Starlevel star,Integer page,Integer limit){
		Map<String,Object> map=new HashMap<String,Object>();
		PageHelper.startPage(page,limit);
		PageInfo<Starlevel> pageinfo=new PageInfo<Starlevel>(biz.queryStar());
		map.put("code", "0");
		map.put("count", pageinfo.getTotal());
		map.put("msg", "");
		map.put("data", pageinfo.getList());
		return map;
	}
	
	@GetMapping("queryStarid/{starid}")
	public Starlevel queryStarid(@PathVariable Integer starid){
		return biz.queryStarById(starid);
	}
	
	@PostMapping("addStar")
	public int addStar(String jsonStr){
		Starlevel star=JSON.parseObject(jsonStr,Starlevel.class);
		return biz.addStar(star);
	}
	
	@PutMapping("updateStar")
	public Map<String,String> updateAirInfo(@RequestBody Starlevel star){
		Map<String,String> message=new HashMap<String,String>();
		System.err.println("啊啊啊啊啊啊啊");
		biz.modifyStar(star);
		message.put("code","200");
		message.put("msg","ok");
		return message;
	}
	
	@PostMapping("delStar")
	public int del(String jsonStr) {
		List<Starlevel> star=JSON.parseArray(jsonStr, Starlevel.class);
		return biz.removeStar(star);		
	}
	
}
