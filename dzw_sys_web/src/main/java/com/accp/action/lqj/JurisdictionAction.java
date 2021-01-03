package com.accp.action.lqj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lqj.JurisdictionBiz;
import com.accp.pojo.Jurisdiction;

@RestController
@RequestMapping("/api/JueSe")
public class JurisdictionAction {
	@Autowired
	private JurisdictionBiz biz;
	
	@GetMapping
	public List<Jurisdiction> queryAllJueSe(){
		return biz.queryAllJueSe();
	}
	
}
