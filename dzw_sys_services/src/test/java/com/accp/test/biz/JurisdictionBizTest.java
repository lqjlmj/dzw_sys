package com.accp.test.biz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.lqj.JurisdictionBiz;
import com.accp.pojo.Jurisdiction;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-ctx.xml")
public class JurisdictionBizTest {
	@Autowired
	private JurisdictionBiz biz;
	
	/**
	 * 测试查询所有角色
	 */
	@Test
	public void queryAllJueSe(){
		biz.queryAllJurisdiction();
	}
	
	/**
	 * 测试修改员工角色
	 */
	@Test
	public void updateByCode(){
		biz.modifyByCode("111", "SHY001");
	}
	
	/**
	 * 新增角色信息
	 */
	@Test
	public void addJueSeInfo() {
		Jurisdiction juese=new Jurisdiction("啦啦啦","lll001");
		biz.addJueSe(juese);
	}
	
}
