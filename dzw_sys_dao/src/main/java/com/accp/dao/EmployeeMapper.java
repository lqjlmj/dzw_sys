package com.accp.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Employee;

public interface EmployeeMapper {
	/**
	 * µÇÂ¼
	 * @param eid
	 * @return
	 */
	Employee login(@Param("eaccount")String eaccount,@Param("epwd")String epwd);
	
    int deleteByPrimaryKey(Integer eid);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
    
}