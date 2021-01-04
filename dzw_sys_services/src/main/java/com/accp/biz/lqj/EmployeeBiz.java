package com.accp.biz.lqj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.EmployeeMapper;
import com.accp.pojo.Employee;

@Service
public class EmployeeBiz {
	@Autowired
	private EmployeeMapper dao;
	
	/**
	 * 登录
	 * @param eaccount
	 * @param epwd
	 * @return
	 */
	public Employee login(String eaccount,String epwd){
		return dao.login(eaccount, epwd);
	}
	
}
