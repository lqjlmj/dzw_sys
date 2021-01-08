package com.accp.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.EmployeeMapper;
import com.accp.dao.GroupMapper;
import com.accp.dao.StarlevelMapper;
import com.accp.pojo.Employee;
import com.accp.pojo.Group;
import com.accp.pojo.Starlevel;

@Service
public class PersonnelBiz {
	@Autowired
	private EmployeeMapper EmpDao;
	
	@Autowired
	private GroupMapper GDao;
	
	@Autowired
	private StarlevelMapper StarDao;
	
	/**
	 * 技工星级表-查
	 * @return
	 */
	public List<Starlevel> queryStar(){
		return StarDao.selectStar();
	}
	/**
	 * 根据starid查找
	 * @param starid
	 * @return
	 */
	public Starlevel queryStarById(Integer starid) {
		return StarDao.selectStarById(starid);
	} 
	/**
	 * 技工星级表-增
	 * @param star
	 * @return
	 */
	public int addStar(Starlevel star) {
		return StarDao.addStar(star);
	}
	/**
	 * 技工星级表-改
	 * @param starid
	 * @return
	 */
	public int modifyStar(Starlevel star) {
		return StarDao.updateStar(star);
	}
	/**
	 * 技工星级表-删（多选删）
	 * @param list
	 * @return
	 */
	public int removeStar(List<Starlevel> list) {
		int count=0;
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getStarid());
			StarDao.delStar(list.get(i).getStarid());
			count++;
		}
		return count;
	}
	
	
	
	/**
	 * 员工部门下拉显示
	 * @return
	 */
	public List<Group> findGroup(){
		return GDao.selectGroup();
	}
	
	/**
	 * 组织机构-查询全部
	 * @return
	 */
	public List<Employee> findEmpAll(){
		return EmpDao.selectAll();
	}
}
