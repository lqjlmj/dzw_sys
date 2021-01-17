package com.accp.action.wss;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.pojo.Department;
import com.accp.pojo.Dimissiontext;
import com.accp.pojo.Employee;
import com.accp.pojo.Group;
import com.accp.pojo.Starlevel;
import com.accp.pojo.Station;
import com.accp.vo.EmployeeVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/wss")
public class PersonnelAction {
	
	@Autowired
	private com.accp.biz.wss.PersonnelBiz biz;
	
	/**技工星级*/
	
	@GetMapping("queryStarAll")
	public Map<String,Object> queryStarAll(Starlevel star,Integer page,Integer limit){
		Map<String,Object> map=new HashMap<String,Object>();
		PageHelper.startPage(page,limit);
		PageInfo<Starlevel> pageinfo=new PageInfo<Starlevel>(biz.queryStar());
		
		map.put("code", "0");
		map.put("count", pageinfo.getTotal());
		map.put("msg", "");
		map.put("data", pageinfo.getList());
		return map;
	}
	
	/**
	 * 查询所有星级
	 * @return
	 */
	@RequestMapping("xingji")
	public List<Starlevel> queryAllXingJi(){
		return biz.queryStar();
	}
	
	@GetMapping("queryStarid/{starid}")
	public Starlevel queryStarid(@PathVariable Integer starid){
		return biz.queryStarById(starid);
	}
	
	@PostMapping("addStar")
	public int addStar(String jsonStr){
		Starlevel star=JSON.parseObject(jsonStr,Starlevel.class);
		return biz.addStar(star);
	}
	
	@PutMapping("updateStar")
	public Map<String,String> updateAirInfo(@RequestBody Starlevel star){
		Map<String,String> message=new HashMap<String,String>();
		System.err.println("啊啊啊啊啊啊啊");
		biz.modifyStar(star);
		message.put("code","200");
		message.put("msg","ok");
		return message;
	}
	
	@PostMapping("delStar")
	public int del(String jsonStr) {
		List<Starlevel> star=JSON.parseArray(jsonStr, Starlevel.class);
		return biz.removeStar(star);		
	}
	
	/**组织机构*/
	
	@GetMapping("queryDepAll")
	public List<Department> queryDepAll(){
		return biz.findDepartAll();
	}
	
	@GetMapping("queryEmpVoAll/{deid}/{ename}")
	public Map<String,Object> queryEmpVoAll(Integer page,Integer limit,@PathVariable Integer deid,@PathVariable String ename){
		Map<String,Object> map=new HashMap<String,Object>();
		PageHelper.startPage(page,limit);
		PageInfo<Employee> pageinfo=new PageInfo<Employee>(biz.findEmployeeVo(deid, ename));
		System.out.println("99999999999");
		map.put("code", "0");
		map.put("count", pageinfo.getTotal());
		map.put("msg", "");
		map.put("data", pageinfo.getList());
		return map;
	}
	
	@GetMapping("queryEmpById/{eid}")
	public Employee queryEmpById(@PathVariable Integer eid){
		return biz.findEmployeeVoById(eid);
	}
	
	@PostMapping("addEmpVo")
	public int addEmpVo(String jsonStr){
		EmployeeVo empvo=JSON.parseObject(jsonStr,EmployeeVo.class);
		return biz.addEmployeeVo(empvo);
	}
	
	@PutMapping("updateEmpVo")
	public Map<String,String> updateAirInfo(@PathVariable Integer eid){
		Map<String,String> message=new HashMap<String,String>();
		System.err.println("啊啊啊啊啊啊啊");
		biz.modifyEmployeeVo(eid);
		message.put("code","200");
		message.put("msg","ok");
		return message;
	}
	
	@PostMapping("delEmp")
	public int delEmp(String jsonStr) {
		List<Employee> empvo=JSON.parseArray(jsonStr, Employee.class);
		return biz.removeEmployee(empvo);		
	}
	
	
	/**岗位定义*/
	
	@GetMapping("queryStationAll")
	public Map<String,Object> queryStationAll(Starlevel star,Integer page,Integer limit){
		Map<String,Object> map=new HashMap<String,Object>();
		PageHelper.startPage(page,limit);
		PageInfo<Station> pageinfo=new PageInfo<Station>(biz.findStation());
		
		map.put("code", "0");
		map.put("count", pageinfo.getTotal());
		map.put("msg", "");
		map.put("data", pageinfo.getList());
		return map;
	}
	
	@PostMapping("addStation")
	public int addStation(String jsonStr){
		Station record=JSON.parseObject(jsonStr,Station.class);
		return biz.addStation(record);
	}
	
	@PostMapping("delStation")
	public int delStation(String jsonStr) {
		List<Station> record=JSON.parseArray(jsonStr, Station.class);
		return biz.removeStation(record);		
	}
	
	/*
	 * public Employee queryEmpByEid(@PathVariable Integer eid) { return
	 * biz.queryEmployeeEid(eid); }
	 */
	
	@GetMapping("queryEmpByEid")
	public Map<String,Object> queryEmpByEid(Starlevel star,Integer page,Integer limit){
		Map<String,Object> map=new HashMap<String,Object>();
		PageHelper.startPage(page,limit);
		PageInfo<Employee> pageinfo=new PageInfo<Employee>(biz.queryEmployeeEid());
		
		map.put("code", "0");
		map.put("count", pageinfo.getTotal());
		map.put("msg", "");
		map.put("data", pageinfo.getList());
		return map;
	}
	
	@PostMapping("addDimByEid")
	public int addDimByEid(String jsonStr){
		Dimissiontext dim=JSON.parseObject(jsonStr,Dimissiontext.class);
		return biz.addDimByEid(dim);
	}
	
	@PutMapping("updateEmpByEid/{eid}")
	public Map<String,String> updateEmpByEid(@PathVariable Integer eid){
		Map<String,String> message=new HashMap<String,String>();
		System.err.println("啊啊啊啊啊啊啊");
		biz.modifyEmpEid2(eid);
		message.put("code","200");
		message.put("msg","ok");
		return message;
	}
	
	@GetMapping("queryEmpNameId")
	public List<Employee> queryEmpNameId(){
		return biz.queryEmpNameAndId();
	}
	
	@PutMapping("updateEmpByEid1/{eid}")
	public Map<String,String> updateEmpByEid1(@PathVariable Integer eid){
		Map<String,String> message=new HashMap<String,String>();
		System.err.println("啊啊啊啊啊啊啊");
		biz.modifyEmpEid1(eid);
		message.put("code","200");
		message.put("msg","ok");
		return message;
	}
	
	@DeleteMapping("Dimission/{eid}")
	public Map<String,String> delDimissionEid(@PathVariable Integer eid){
		Map<String,String> message=new HashMap<String,String>();
		biz.removeDimission(eid);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@GetMapping("queryStationByAll")
	public List<Station> queryStationAll(){
		return biz.queryStationAll();
	}
	
	@PutMapping("updateEmpGroup")
	public Map<String,String> updateEmpByGroupid(@RequestBody Group group1){
		Map<String,String> message=new HashMap<String,String>();
		System.err.println("啊啊啊啊啊啊啊");
		biz.modifyEmpGroupId(group1);
		message.put("code","200");
		message.put("msg","ok");
		return message;
	}
	
	@PutMapping("updateGroup/{groupid}")
	public Map<String,String> updateGroup(@PathVariable Integer groupid){
		Map<String,String> message=new HashMap<String,String>();
		System.err.println("啊啊啊啊啊啊啊");
		biz.modifyGroup(groupid);
		message.put("code","200");
		message.put("msg","ok");
		return message;
	}
	
	@PostMapping("addGroup")
	public int addGroup(String jsonStr){
		Group group1=JSON.parseObject(jsonStr,Group.class);
		return biz.addGroup(group1);
	}
	
	@DeleteMapping("delGroup/{groupid}")
	public Map<String,String> delGroup(@PathVariable Integer groupid){
		Map<String,String> message=new HashMap<String,String>();
		biz.removeGroup(groupid);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	@GetMapping("queryGroup1")
	public List<Group> queryGroup(){
		return biz.queryGroup11();
	}
	

	@GetMapping("queryEmpGroupStarlevel/{groupid}")
	public Map<String,Object> queryEmpGroupStarlevel(Integer page,Integer limit,@PathVariable Integer groupid){
		Map<String,Object> map=new HashMap<String,Object>();
		PageHelper.startPage(page,limit);
		PageInfo<Employee> pageinfo=new PageInfo<Employee>(biz.findEmpGroupStarlevel(groupid));
		System.out.println("99999999999");
		map.put("code", "0");
		map.put("count", pageinfo.getTotal());
		map.put("msg", "");
		map.put("data", pageinfo.getList());
		return map;
	}
	
	@GetMapping("queryStarlevelAll")
	public List<Starlevel> queryStarlevelAll(){
		return biz.findStarlevelAll();
	}
	
}
