package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Jurisdiction;

public interface JurisdictionMapper {
	/**
	 * 角色表查询
	 * @param jurisdictionid
	 * @return
	 */
	List<Jurisdiction> queryAllJurisdiction();
	
	/**
	 * 根据编码查询角色对象
	 * @param jurisdictioncode
	 * @return
	 */
	Jurisdiction queryJurisdictionByCode(@Param("jurisdictioncode")String jurisdictioncode);
	
	/**
	 * 根据角色id删除对象
	 * @param jurisdictionid
	 * @return
	 */
    int deleteByPrimaryKey(@Param("jurisdictioncode")String jurisdictioncode);
    
    /**
     * 新增角色信息
     * @param record
     * @return
     */
    int insert(@Param("juese")Jurisdiction juese);

    int insertSelective(Jurisdiction record);

    Jurisdiction selectByPrimaryKey(Integer jurisdictionid);
    
    /**
     * 根据编码修改员工角色
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(@Param("jurisdictionname") String jurisdictionname,@Param("jurisdictioncode") String jurisdictioncode);

    int updateByPrimaryKey(Jurisdiction record);
}