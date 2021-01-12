package com.accp.test.biz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.lqj.UserBiz;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-ctx.xml")
public class UserBizTest {
	@Autowired
	private UserBiz biz;
	
	/**
	 * 分页查询用户表
	 */
	@Test
	public void queryAllUser(){
		biz.queryAllUser(1,3);
	}
	
	/**
	 * 查询用户表的总条数
	 */
	@Test
	public void queryUserCount(){
		biz.queryUserCount();
	}
	
	/**
	 * 根据用户编码模糊查询
	 */
	@Test
	public void queryUserByUserNo(){
		biz.queryUserByUserNo("M");
	}
	
	/**
	 * 根据用户编码查询对象
	 */
	@Test
	public void queryUserByBianHao(){
		biz.queryUserByBianHao("M001");
	}
	
	/**
	 * 根据用户编码删除对象
	 */
	@Test
	public void removeUserByUserNo(){
		biz.removeUserByUserNo("ww006");
	}
	
	
}
