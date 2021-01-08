package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Starlevel;

public interface StarlevelMapper {
    /**
     * ��ѯ�����Ǽ�
     * @return
     */
	List<Starlevel> selectStar();
	/**
	 * �����Ǽ�
	 * @param star
	 * @return
	 */
	int addStar(Starlevel star);
	/**
	 * ����starid��ѯ����
	 * @param starid
	 * @return
	 */
	Starlevel selectStarById(Integer starid);
	/**
	 * �޸��Ǽ�
	 * @param starid
	 * @return
	 */
	int updateStar(@Param("star") Starlevel star);
	/**
	 * ɾ���Ǽ�
	 * @param starid
	 * @return
	 */
	int delStar(Integer starid);
	
	
}