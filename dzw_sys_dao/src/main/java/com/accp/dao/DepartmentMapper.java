package com.accp.dao;

import java.util.List;

import com.accp.pojo.Department;

public interface DepartmentMapper {
	
	/**
	 * 下拉列表查询显示
	 * @return
	 */
	List<Department> selectDAll();
}