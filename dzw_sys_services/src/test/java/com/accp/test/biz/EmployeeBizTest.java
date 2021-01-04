package com.accp.test.biz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.lqj.EmployeeBiz;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-ctx.xml")
public class EmployeeBizTest {
	@Autowired
	private EmployeeBiz biz;
	
	@Test
	public void testLogin(){
		biz.login("admin","12345");
	}
	
}
