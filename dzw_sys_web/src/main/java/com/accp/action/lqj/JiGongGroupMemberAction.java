package com.accp.action.lqj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lqj.JiGongGroupMemberBiz;
import com.accp.pojo.Armember;

@RestController
@RequestMapping("api/jigong")
@CrossOrigin
public class JiGongGroupMemberAction {
	@Autowired
	private JiGongGroupMemberBiz biz;
	
	@GetMapping
	public List<Armember> queryAllJiGong(){
		return biz.queryAllJiGong();
	}
	
}
