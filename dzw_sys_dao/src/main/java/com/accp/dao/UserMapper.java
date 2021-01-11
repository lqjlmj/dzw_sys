package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.User;

public interface UserMapper {
	/**
	 * ��ѯ���пͻ���Ϣ
	 * @return
	 */
	List<User> queryAllUser(@Param("start")Integer start,@Param("pageSize")Integer pageSize);
	
	/**
	 * �����û���Ų�ѯ
	 * @param userno
	 * @return
	 */
	List<User> queryUserByUserNo(@Param("userno")String userno);
	
	int queryUserCount();
	
	/**
	 * �����û�����ɾ������
	 * @param userid
	 * @return
	 */
    int deleteByPrimaryKey(@Param("userno")String userno);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}