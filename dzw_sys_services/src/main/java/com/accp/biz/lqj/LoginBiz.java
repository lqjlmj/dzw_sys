package com.accp.biz.lqj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.LoginMapper;
import com.accp.pojo.LqjEmployee;

@Service
public class LoginBiz {
	@Autowired
	private LoginMapper dao;
	
	
	public LqjEmployee login(String eaccount,String epwd){
		return dao.login(eaccount, epwd);
	}
	
}
