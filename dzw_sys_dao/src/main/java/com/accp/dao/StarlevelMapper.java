package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Starlevel;

public interface StarlevelMapper {
    /**
     * 查询技工星级
     * @return
     */
	List<Starlevel> selectStar();
	/**
	 * 新增星级
	 * @param star
	 * @return
	 */
	int addStar(Starlevel star);
	/**
	 * 更加starid查询单个
	 * @param starid
	 * @return
	 */
	Starlevel selectStarById(Integer starid);
	/**
	 * 修改星级
	 * @param starid
	 * @return
	 */
	int updateStar(@Param("star") Starlevel star);
	/**
	 * 删除星级
	 * @param starid
	 * @return
	 */
	int delStar(Integer starid);
	
	
}