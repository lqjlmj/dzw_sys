package com.accp.action.lqj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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
	public List<Jurisdiction> queryAllJurisdiction(){
		return biz.queryAllJurisdiction();
	}
	
	/**
	 * 根据角色编码删除对象
	 * @param jurisdictionid
	 * @return
	 */
	@RequestMapping("{jurisdictioncode}")
	public int deleteById(@PathVariable String jurisdictioncode){
		return biz.deleteById(jurisdictioncode);
	}
	
}
