package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Jurisdiction;

public interface JurisdictionMapper {
	/**
	 * ��ɫ���ѯ
	 * @param jurisdictionid
	 * @return
	 */
	List<Jurisdiction> queryAllJurisdiction();
	
	/**
	 * ���ݽ�ɫidɾ������
	 * @param jurisdictionid
	 * @return
	 */
    int deleteByPrimaryKey(@Param("jurisdictioncode")String jurisdictioncode);

    int insert(Jurisdiction record);

    int insertSelective(Jurisdiction record);

    Jurisdiction selectByPrimaryKey(Integer jurisdictionid);

    int updateByPrimaryKeySelective(Jurisdiction record);

    int updateByPrimaryKey(Jurisdiction record);
}