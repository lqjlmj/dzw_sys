package com.accp.action.lqj;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lqj.JurisdictionBiz;
import com.accp.pojo.Jurisdiction;

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
	
	@GetMapping("js")
	public List<Jurisdiction> queryAll(){
		return biz.queryAllJurisdiction();
	}
	
	/**
	 * 根据角色编码查询角色对象
	 * @param jurisdictioncode
	 * @return
	 */
	@RequestMapping("/Jurisdiction/{jurisdictioncode}")
	public Jurisdiction queryJurisdictionByCode(@PathVariable String jurisdictioncode){
		return biz.queryJurisdiction(jurisdictioncode);
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
	
	/**
	 * 根据编码修改员工角色
	 * @param jurisdictionname
	 * @param jurisdictioncode
	 * @return
	 */
	@RequestMapping("{jurisdictionname}/{jurisdictioncode}")
	public Map<String, String> modifyByCode(@PathVariable String jurisdictionname,@PathVariable String jurisdictioncode){
		Map<String, String> message = new HashMap<String, String>();
		biz.modifyByCode(jurisdictionname, jurisdictioncode);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	/**
	 * 新增角色信息
	 * @param juese
	 * @return
	 */
	@PostMapping("juese")
	public Map<String, String> addJueSe(@RequestBody Jurisdiction juese){
		Map<String, String> message = new HashMap<String, String>();
		biz.addJueSe(juese);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
}
