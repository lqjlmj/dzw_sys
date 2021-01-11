package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.User;

public interface UserMapper {
	/**
	 * 查询所有客户信息
	 * @return
	 */
	List<User> queryAllUser(@Param("start")Integer start,@Param("pageSize")Integer pageSize);
	
	/**
	 * 根据用户编号查询
	 * @param userno
	 * @return
	 */
	List<User> queryUserByUserNo(@Param("userno")String userno);
	
	int queryUserCount();
	
	/**
	 * 根据用户编码删除对象
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