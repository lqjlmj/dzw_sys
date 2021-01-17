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
     * ��������ҳ��ѯ�����š�Ա��������
     * @param dename
     * @param ename
     * @return
     */
    List<Employee> selectAllByNameandDepartmentAndStation(@Param("deid") Integer deid,@Param("ename") String ename);
    /**
     * ����id��ѯȫ��
     * @param eid
     * @return
     */
    Employee selectById(Integer eid);
    /**
     * ����Vo
     * @param empvo
     * @return
     */
    int addEmployee(EmployeeVo empvo);
    /**
     * ɾ��Vo
     * @param eid
     * @return
     */
    int delEmployee(Integer eid);
    /**
     * �޸�Vo
     * @param empvo
     * @return
     */
    int updateEmployee(@Param("eid") Integer eid);
    /**
     * ��ѯ
     * @param eid
     * @return
     */
    List<Dimissiontext> selectDimById(@Param("eid") int eid);
    /**
     * �����ְ�޸�״̬Ϊ2
     * @param eid
     * @return
     */
	int updateEmployeeByEid1(int eid);
	/**
	 * �����ְ�޸�״̬Ϊ1
	 * @param eid
	 * @return
	 */
	int updateEmployeeByEid2(int eid);
	/**
	 * ������ְ
	 * @param dim
	 * @return
	 */
	int insertDimByEid(Dimissiontext dimissiontext);
	/**
	 * ��ѯ
	 * @param eid
	 * @return
	 */
	public List<Employee> selectEmpByEid();
	/**
	 * ��������
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
	 * group��   ������
	 * @param group
	 * @return
	 */
	int addGroup(Group group1);
	/**
	 * Employee  ������Ա==����eid��employee���е�groupid�����޸�
	 * @param groupid
	 * @return
	 */
	int updateGroupByGroupid(@Param("group1") Group group1);
	/**
	 * �޸�����Ϣ
	 * @param groupid
	 * @return
	 */
	int updateGroup(Integer groupid);
	/**
	 * ɾ����
	 * @param groupid
	 * @return
	 */
	int delGroupByid(@Param("groupid") Integer groupid);
	
	List<Group> selectGroup11();
	
	List<Employee> queryAllEmpGroupStarlevel(Integer groupid);
	
	List<Starlevel> queryStarlevelAll();
}