package com.accp.biz.lqj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.lqj.IJurisdictionDao;
import com.accp.pojo.Jurisdiction;

@Service
public class JurisdictionBiz {
	@Autowired
	private IJurisdictionDao dao;
	
	public List<Jurisdiction> queryAllJueSe(){
		return dao.queryAllJueSe();
	}
	
}
