package com.accp.action.lqj;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lqj.UserBiz;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UserAction {
	@Autowired
	private UserBiz biz;
	
	/**
	 * 分页查询
	 * @param page
	 * @param limit
	 * @return
	 */
	@GetMapping("fenye")
	public Map<String,Object> queryAllUser(Integer page,Integer limit){
		int start=page * limit-limit;
		Map<String, Object> maps = new Hashtable<>();
		maps.put("code",0);
		maps.put("msg","");
		maps.put("count",biz.queryUserCount());
		maps.put("data",biz.queryAllUser(start,limit));
		return maps;
	}
	
	/**
	 * 根据用户编码模糊查询
	 * @param userno
	 * @return
	 */
	@RequestMapping("moHu")
	public Map<String,Object> queryUserByUserNo(String userno){
		Map<String, Object> map = new HashMap<String, Object>();
		  map.put("code", "0");
		  map.put("count", biz.queryUserCount());
		  map.put("msg","");
		  map.put("data",biz.queryUserByUserNo(userno));
		  return map;
	}
	
	/**
	 * 根据用户编码删除对象
	 * @param userno
	 * @return
	 */
	@RequestMapping("{userno}")
	public int removeUserByUserNo(@PathVariable String userno){
		return biz.removeUserByUserNo(userno);
	}
	
	
}
