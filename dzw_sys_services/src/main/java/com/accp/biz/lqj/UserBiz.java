package com.accp.biz.lqj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.UserMapper;
import com.accp.pojo.User;

@Service
public class UserBiz {
	@Autowired
	private UserMapper dao;
	
	/**
	 * 查询所有客户信息
	 * @return
	 */
	public List<User> queryAllUser(Integer start,Integer pageSize){
		return dao.queryAllUser(start,pageSize);
	}
	
	/**
	 * 查询客户表总条数
	 * @return
	 */
	public int queryUserCount(){
		return dao.queryUserCount();
	}
	
	/**
	 * 根据用户编码查询
	 * @param userno
	 * @return
	 */
	public List<User> queryUserByUserNo(String userno){
		return dao.queryUserByUserNo(userno);
	}
	
	/**
	 * 根据用户编码删除对象
	 * @param userno
	 * @return
	 */
	public int removeUserByUserNo(String userno){
		return dao.deleteByPrimaryKey(userno);
	}
	
	
}
