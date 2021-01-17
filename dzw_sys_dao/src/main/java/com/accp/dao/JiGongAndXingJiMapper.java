package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.vo.JiGongAndXingJi;

public interface JiGongAndXingJiMapper {
	/**
	 * 查询所有技工和对应的星级
	 * @return
	 */
	List<JiGongAndXingJi> queryAllJiGongAndXingJi();
	
	/**
	 * 新增技工
	 * @param jg
	 * @return
	 */
	int addJiGong(@Param("jg")JiGongAndXingJi jg);
	
	/**
	 * 根据主键id删除技工成员
	 * @return
	 */
	int removeJiGongById(@Param("armemberid")Integer armemberid);
	
}
