package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Department;
import com.accp.pojo.Dimissiontext;
import com.accp.pojo.Employee;
import com.accp.pojo.Group;
import com.accp.pojo.Starlevel;
import com.accp.pojo.Station;
import com.accp.vo.EmployeeVo;

public interface EmployeeMapper {	
    /**
     * 多条件分页查询（部门、员工姓名）
     * @param dename
     * @param ename
     * @return
     */
    List<Employee> selectAllByNameandDepartmentAndStation(@Param("deid") Integer deid,@Param("ename") String ename);
    /**
     * 根据id查询全部
     * @param eid
     * @return
     */
    Employee selectById(Integer eid);
    /**
     * 新增Vo
     * @param empvo
     * @return
     */
    int addEmployee(EmployeeVo empvo);
    /**
     * 删除Vo
     * @param eid
     * @return
     */
    int delEmployee(Integer eid);
    /**
     * 修改Vo
     * @param empvo
     * @return
     */
    int updateEmployee(@Param("eid") Integer eid);
    /**
     * 查询
     * @param eid
     * @return
     */
    List<Dimissiontext> selectDimById(@Param("eid") int eid);
    /**
     * 点击离职修改状态为2
     * @param eid
     * @return
     */
	int updateEmployeeByEid1(int eid);
	/**
	 * 点击离职修改状态为1
	 * @param eid
	 * @return
	 */
	int updateEmployeeByEid2(int eid);
	/**
	 * 新增离职
	 * @param dim
	 * @return
	 */
	int insertDimByEid(Dimissiontext dimissiontext);
	/**
	 * 查询
	 * @param eid
	 * @return
	 */
	public List<Employee> selectEmpByEid();
	/**
	 * 姓名下拉
	 * @return
	 */
	public List<Employee> selectEmpNameAndId();
	
	public List<Department> selectDepartId();
	
	public List<Station> selectStationById();
	
	public List<Station> selectStationAll();
	
	int delDimission(@Param("eid") Integer eid);
	
	
	List<Group> selectgroupAll(Integer groupid);
	
	List<Starlevel> selectStartlevel1(Integer starid);
	
	/**
	 * group表   新增组
	 * @param group
	 * @return
	 */
	int addGroup(Group group1);
	/**
	 * Employee  新增组员==根据eid将employee表中的groupid进行修改
	 * @param groupid
	 * @return
	 */
	int updateGroupByGroupid(@Param("group1") Group group1);
	/**
	 * 修改组信息
	 * @param groupid
	 * @return
	 */
	int updateGroup(Integer groupid);
	/**
	 * 删除组
	 * @param groupid
	 * @return
	 */
	int delGroupByid(@Param("groupid") Integer groupid);
	
	List<Group> selectGroup11();
	
	List<Employee> queryAllEmpGroupStarlevel(Integer groupid);
	
	List<Starlevel> queryStarlevelAll();
}