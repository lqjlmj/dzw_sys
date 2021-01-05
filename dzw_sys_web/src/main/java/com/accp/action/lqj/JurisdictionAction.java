package com.accp.action.lqj;

import java.util.Hashtable;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lqj.JurisdictionBiz;

@RestController
@RequestMapping("/api/Jurisdictions")
@CrossOrigin
public class JurisdictionAction {
	@Autowired
	private JurisdictionBiz biz;
	
	/**
	 * 角色表查询
	 * @return
	 */
	@RequestMapping
	public Map<String, Object> queryAllJurisdiction(){
		Map<String, Object> maps = new Hashtable<>();
		maps.put("code",0);
		maps.put("msg","");
		maps.put("count",4);
		maps.put("data",biz.queryAllJurisdiction());
		return maps;
	}
	
	/**
	 * 根据角色编码删除对象
	 * @param jurisdictionid
	 * @return
	 */
	@RequestMapping("{jurisdictioncode}")
	public int deleteById(@PathVariable String jurisdictioncode){
		return biz.removeById(jurisdictioncode);
	}
	
}
