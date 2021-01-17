package com.accp.biz.wss;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.JiGongAndXingJiMapper;
import com.accp.vo.JiGongAndXingJi;

@Service
public class JiGongAndXingJiBiz {
	@Autowired
	private JiGongAndXingJiMapper dao;
	
	/**
	 * 查询所有技工以及对应的星级
	 * @return
	 */
	public List<JiGongAndXingJi> queryAllJiGongAndXingJi(){
		return dao.queryAllJiGongAndXingJi();
	}
	
	/**
	 * 新增技工
	 * @param jg
	 * @return
	 */
	public int addJiGong(JiGongAndXingJi jg){
		return dao.addJiGong(jg);
	}
	
	/**
	 * 根据主键id删除技工
	 * @param jg
	 * @return
	 */
	public int removeJiGongId(Integer armemberid){
		return dao.removeJiGongById(armemberid);
	}
	
}
