package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.vo.CarAndBrand;

public interface CarAndBrandMapper {
	/**
	 * ��ѯ�����ͳ�Ʒ��
	 * @return
	 */
	List<CarAndBrand> queryAllCarAndBrand();
	
	/**
	 * ��ѯ������
	 * @return
	 */
	int queryCount();
	
	/**
	 * ͨ�����ƺ�ģ����ѯ
	 * @return
	 */
	List<CarAndBrand> queryAllCarByMoHu(@Param("ulicense")String ulicense);
	
	/**
	 * ���ݳ������ɾ������
	 * @return
	 */
	int removeCarById(@Param("uvehicleid")Integer uvehicleid);
	
	/**
	 * ������������
	 * @param car
	 * @return
	 */
	int addCar(@Param("car")CarAndBrand car);
	
	/**
	 * ͨ�����ƺŲ�ѯ����
	 * @param ulicense
	 * @return
	 */
	CarAndBrand queryCarByUlicense(@Param("ulicense")String ulicense);
	
	/**
	 * ͨ�����ƺ��޸Ķ���
	 * @param record
	 * @return
	 */
	int modifyCarByUlicense(@Param("record")CarAndBrand record);
	
}
