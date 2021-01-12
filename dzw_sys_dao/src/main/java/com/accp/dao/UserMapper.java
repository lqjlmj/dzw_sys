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
	 * �����û����ģ����ԃ
	 * @param userno
	 * @return
	 */
	List<User> queryUserByUserNo(@Param("userno")String userno);
	
	/**
	 * �����û���Ų�ѯ����
	 * @param userno
	 * @return
	 */
	User queryUserByBianHao(@Param("userno")String userno);
	
	int queryUserCount();
	
	/**
	 * �����û�����ɾ������
	 * @param userid
	 * @return
	 */
    int deleteByPrimaryKey(@Param("userno")String userno);
    
    /**
     * �����û���Ϣ
     * @param record
     * @return
     */
    int insert(@Param("user")User user);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);
    
    /**
     * �޸��û���Ϣ
     * @param record
     * @return
     */
    int updateByPrimaryKey(@Param("record")User record);
}