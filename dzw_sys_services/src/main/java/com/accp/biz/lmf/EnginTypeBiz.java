package com.accp.biz.lmf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.EngineTypeMapper;
import com.accp.pojo.EngineType;

@Service
public class EnginTypeBiz {

	@Autowired
	private EngineTypeMapper endao;
	
	public List<EngineType> seleQueryAllEnginType(Integer start,Integer limit){
		return endao.seleQueryAllEnginType(start,limit);
	}
	
	public List<EngineType> seleQueryAllEnginTypes(){
		return endao.seleQueryAllEnginTypes();
	}
	
	public int removeByPrimaryKey(List<EngineType> list) {
		int count=0;
		for(int i=0;i<list.size();i++) {
			endao.removeByPrimaryKey(list.get(i).getEnginetypeid());
			count++;
		}
		return count;
	}
	
	public int modifyByPrimaryKeySelective(EngineType engtype) {
		return endao.modifyByPrimaryKeySelective(engtype);
	}
	
	public int addSelective(String engtypename) {
		return endao.addSelective(engtypename);
	}
	
	public List<EngineType> selectMohuChaEngin(String enginetypename){
		return endao.selectMohuChaEngin(enginetypename);
	}
}
