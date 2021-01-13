package com.accp.biz.lmf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.VehicleBrandMapper;
import com.accp.pojo.VehicleBrand;

@Service
public class VehicleBrandBiz {

	@Autowired
	private VehicleBrandMapper vehbiz;
	
	/**
	 * ����Ʒ�Ʋ�ѯȫ��
	 * @return
	 */
	public List<VehicleBrand> selectQueryAllVehicle(){
		return vehbiz.selectQueryAllVehicle();
	}
	
	/**
	 * ����vbrandid��ѯ
	 * @return
	 */
	public VehicleBrand seleQueryByidVehi(String vbrandid) {
		return vehbiz.seleQueryByidVehi(vbrandid);
	}
	
	/**
	 * ����Ʒ��ɾ��
	 * @param vbrandid
	 * @return
	 */
	public int removeByPrimaryKey(Integer vbrandid) {
		return vehbiz.removeByPrimaryKey(vbrandid);
	}
	
	/**
	 * ����Ʒ�Ƶ����
	 * @param vbrandno
	 * @param vbrandname
	 * @return
	 */
	public int addinsertVehivo(String vbrandno , String vbrandname) {
		return vehbiz.addinsertVehivo(vbrandno, vbrandname);
	}
	
	/**
	 * ����Ʒ�Ƶ��޸�
	 * @param vbrandno
	 * @param vbrandname
	 * @return
	 */
	public int modifyupdateByPrimaryKeySelective(String vbrandno , String vbrandname , Integer vbrandid) {
		return vehbiz.modifyupdateByPrimaryKeySelective(vbrandno, vbrandname,vbrandid);
	}
}
