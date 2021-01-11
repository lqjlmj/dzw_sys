package com.accp.dao;

import java.util.List;

import com.accp.pojo.Employee;
import com.accp.pojo.Group;

public interface EmployeeMapper {	
    
    List<Employee> selectAll();
    
}