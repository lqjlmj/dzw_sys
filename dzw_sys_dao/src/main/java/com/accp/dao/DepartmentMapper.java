package com.accp.dao;

import java.util.List;

import com.accp.pojo.Department;

public interface DepartmentMapper {
	
	/**
	 * �����б��ѯ��ʾ
	 * @return
	 */
	List<Department> selectDAll();
}