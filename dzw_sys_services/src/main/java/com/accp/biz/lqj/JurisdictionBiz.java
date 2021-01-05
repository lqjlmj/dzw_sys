package com.accp.biz.lqj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.JurisdictionMapper;
import com.accp.pojo.Jurisdiction;

@Service
public class JurisdictionBiz {
	@Autowired
	private JurisdictionMapper dao;
	
	/**
	 * 角色表查询
	 * @return
	 */
	public List<Jurisdiction> queryAllJurisdiction(){
		return dao.queryAllJurisdiction();
	}
	
	/**
	 * 根据角色编码删除对象
	 * @param jurisdictionid
	 * @return
	 */
	public int deleteById(String jurisdictioncode){
		return dao.deleteByPrimaryKey(jurisdictioncode);
	}
	
	
}
