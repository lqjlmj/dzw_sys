package com.accp.action.lqj;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lqj.EmployeeBiz;
import com.accp.pojo.Employee;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin
public class EmployeeAction {
	@Autowired
	private EmployeeBiz biz;
	
	/**
	 * 登录
	 * @param eaccount
	 * @param epwd
	 * @return
	 */
	@GetMapping("{eaccount}/{epwd}")
	public Employee login(HttpSession session,@PathVariable String eaccount,@PathVariable String epwd){
		Employee u= biz.login(eaccount,epwd);
		Map<String, String> message = new HashMap<String, String>();
		if(u!=null){
			session.setAttribute("u",u);
			message.put("code", "200");
			message.put("msg", "ok");
		}else {
			message.put("code", "300");
			message.put("msg", "error");
		}
		return u;
	}
	
	@GetMapping
	public String loginOut(HttpSession session){
		session.removeAttribute("u");
		session.invalidate();
		return "OK";
	}
	
	
}
