package com.accp.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.LqjEmployee;

public interface LoginMapper {
	/**
	 * ��¼
	 * @param eaccount
	 * @param epwd
	 * @return
	 */
	LqjEmployee login(@Param("eaccount")String eaccount,@Param("epwd")String epwd);
}
