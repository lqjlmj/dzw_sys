package com.accp.biz.lqj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.JiGongGroupMember;
import com.accp.pojo.Armember;

@Service
public class JiGongGroupMemberBiz {
	@Autowired
	private JiGongGroupMember dao;
	
	/**
	 * 查询所有技工组成员
	 * @return
	 */
	public List<Armember> queryAllJiGong(){
		return dao.queryAllJiGong();
	}
	
}
