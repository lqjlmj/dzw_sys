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
	 * 根据角色id删除对象
	 * @param jurisdictionid
	 * @return
	 */
    int deleteByPrimaryKey(@Param("jurisdictioncode")String jurisdictioncode);

    int insert(Jurisdiction record);

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