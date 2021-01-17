package com.accp.action.wss;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.wss.JiGongAndXingJiBiz;
import com.accp.vo.JiGongAndXingJi;

@RestController
@RequestMapping("/api/jgxj")
public class JiGongAndXingJiAction {
	@Autowired
	private JiGongAndXingJiBiz biz;
	
	/**
	 * 查询所有技工以及对应的星级
	 * @return
	 */
	@GetMapping
	public Map<String, Object> queryAllJiGongAndXingJi(){
		Map<String, Object> maps = new Hashtable<>();
		maps.put("code",0);
		maps.put("msg","");
		maps.put("count",20);
		maps.put("data",biz.queryAllJiGongAndXingJi());
		return maps;
	}
	
	/**
	 * 新增技工
	 * @param juese
	 * @return
	 */
	@PostMapping("jg")
	public Map<String, String> addJiGong(@RequestBody JiGongAndXingJi jg){
		Map<String, String> message = new HashMap<String, String>();
		biz.addJiGong(jg);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	/**
	 * 根据主键id删除技工
	 * @param jurisdictionid
	 * @return
	 */
	@RequestMapping("{armemberid}")
	public int deleteById(@PathVariable Integer armemberid){
		return biz.removeJiGongId(armemberid);
	}
	
	
}
