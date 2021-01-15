package com.accp.test.biz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.lqj.CarAndBrandBiz;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-ctx.xml")
public class CarAndBrandBizTest {
	@Autowired
	private CarAndBrandBiz biz;
	
	/**
	 * 测试查询车辆资料
	 */
	@Test
	public void queryAllCar(){
		biz.queryAllCar();
	}
	
	/**
	 * 测试通过车牌号模糊查询
	 */
	@Test
	public void queryAllCarByMoHu(){
		biz.queryAllCarByMoHu("京");
	}
	
	/**
	 * 测试通过车辆编号删除对象
	 */
	@Test
	public void removeCarById(){
		biz.removeCarById(11);
	}
	
	@Test
	public void queryByCar() {
		biz.queryCarByUlicense("京.SA003");
	}
}
