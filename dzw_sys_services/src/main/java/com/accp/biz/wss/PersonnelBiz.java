package com.accp.biz.wss;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.DepartmentMapper;
import com.accp.dao.EmployeeMapper;
import com.accp.dao.GroupMapper;
import com.accp.dao.StarlevelMapper;
import com.accp.dao.StationMapper;
import com.accp.pojo.Department;
import com.accp.pojo.Dimissiontext;
import com.accp.pojo.Employee;
import com.accp.pojo.Group;
import com.accp.pojo.Starlevel;
import com.accp.pojo.Station;
import com.accp.vo.EmployeeVo;

@Service
public class PersonnelBiz {
	@Autowired
	private EmployeeMapper EmpDao;
	
	@Autowired
	private GroupMapper GDao;
	
	@Autowired
	private StarlevelMapper StarDao;
	
	@Autowired
	private DepartmentMapper DepDao;
	
	@Autowired
	private StationMapper staDao;
	
	
	public List<Starlevel> queryStar(){
		return StarDao.selectStar();
	}
	
	public Starlevel queryStarById(Integer starid) {
		return StarDao.selectStarById(starid);
	} 
	
	public int addStar(Starlevel star) {
		return StarDao.addStar(star);
	}
	
	public int modifyStar(Starlevel star) {
		return StarDao.updateStar(star);
	}
	
	public int removeStar(List<Starlevel> list) {
		int count=0;
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getStarid());
			StarDao.delStar(list.get(i).getStarid());
			count++;
		}
		return count;
	}
	
	public List<Department> findDepartAll(){
		return DepDao.selectDAll();
	}
	
	
	public List<Employee> findEmployeeVo(Integer deid,String ename){
		return EmpDao.selectAllByNameandDepartmentAndStation(deid, ename);
	}
	
	public Employee findEmployeeVoById(Integer eid) {
		return EmpDao.selectById(eid);
	}
	
	public int addEmployeeVo(EmployeeVo empvo) {
		return EmpDao.addEmployee(empvo);
	}
	
	public int modifyEmployeeVo(Integer eid) {
		return EmpDao.updateEmployee(eid);
	}
	
	public int removeEmployee(List<Employee> list) {
		int count=0;
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getEid());
			EmpDao.delEmployee(list.get(i).getEid());
			count++;
		}
		return count;
	}
	
	
	
	public List<Station> findStation(){
		return staDao.selectStationAll();
	}
	
	public int addStation(Station record) {
		return staDao.insertStation(record);
	}
	
	public int removeStation(List<Station> list) {
		int count=0;
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getStationid());
			staDao.deleteByPrimaryKey(list.get(i).getStationid());
			count++;
		}
		return count;
	}
	
	public List<Employee> queryEmployeeEid() {
		return EmpDao.selectEmpByEid();
	}
	
	public List<Dimissiontext> queryDimEid(Integer eid){
		return EmpDao.selectDimById(eid);
	}
	
	public int modifyEmpEid1(Integer eid) {
		return EmpDao.updateEmployeeByEid1(eid);
	} 
	
	public int modifyEmpEid2(Integer eid) {
		return EmpDao.updateEmployeeByEid2(eid);
	}
	
	public int addDimByEid(Dimissiontext dim) {
		return EmpDao.insertDimByEid(dim);
	}
	
	public List<Employee> queryEmpNameAndId(){
		return EmpDao.selectEmpNameAndId();
	}
	
	public void removeDimission(Integer eid) {
		EmpDao.delDimission(eid);
	}
	
	public List<Station> queryStationAll(){
		return EmpDao.selectStationAll();
	}
	
	public List<Starlevel> queryStarlevel1(Integer starid){
		return EmpDao.selectStartlevel1(starid);
	}
	
	public List<Group> queryGroup(Integer groupid){
		return EmpDao.selectgroupAll(groupid);
	}
	
	public int addGroup(Group group1) {
		return EmpDao.addGroup(group1);
	}
	
	public int modifyEmpGroupId(Group group1) {
		return EmpDao.updateGroupByGroupid(group1);
	}
	
	public int modifyGroup(Integer groupid) {
		return EmpDao.updateGroup(groupid);
	}
	
	public int removeGroup(int groupid) {
		return EmpDao.delGroupByid(groupid);
	}	
	
	public List<Group> queryGroup11(){
		return EmpDao.selectGroup11();
	}
	
	public List<Employee> findEmpGroupStarlevel(Integer groupid){
		return EmpDao.queryAllEmpGroupStarlevel(groupid);
	}
	
	public List<Starlevel> findStarlevelAll(){
		return EmpDao.queryStarlevelAll();
	}
}
