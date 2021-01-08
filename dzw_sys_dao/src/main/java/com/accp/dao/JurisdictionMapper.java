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
	 * ���ݱ����ѯ��ɫ����
	 * @param jurisdictioncode
	 * @return
	 */
	Jurisdiction queryJurisdictionByCode(@Param("jurisdictioncode")String jurisdictioncode);
	
	/**
	 * ���ݽ�ɫidɾ������
	 * @param jurisdictionid
	 * @return
	 */
    int deleteByPrimaryKey(@Param("jurisdictioncode")String jurisdictioncode);
    
    /**
     * ������ɫ��Ϣ
     * @param record
     * @return
     */
    int insert(@Param("juese")Jurisdiction juese);

    int insertSelective(Jurisdiction record);

    Jurisdiction selectByPrimaryKey(Integer jurisdictionid);
    
    /**
     * ���ݱ����޸�Ա����ɫ
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(@Param("jurisdictionname") String jurisdictionname,@Param("jurisdictioncode") String jurisdictioncode);

    int updateByPrimaryKey(Jurisdiction record);
}