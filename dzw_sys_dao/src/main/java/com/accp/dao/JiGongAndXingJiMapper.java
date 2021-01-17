package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.vo.JiGongAndXingJi;

public interface JiGongAndXingJiMapper {
	/**
	 * ��ѯ���м����Ͷ�Ӧ���Ǽ�
	 * @return
	 */
	List<JiGongAndXingJi> queryAllJiGongAndXingJi();
	
	/**
	 * ��������
	 * @param jg
	 * @return
	 */
	int addJiGong(@Param("jg")JiGongAndXingJi jg);
	
	/**
	 * ��������idɾ��������Ա
	 * @return
	 */
	int removeJiGongById(@Param("armemberid")Integer armemberid);
	
}
