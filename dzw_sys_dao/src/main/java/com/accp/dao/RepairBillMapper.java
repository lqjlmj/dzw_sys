package com.accp.dao;

import com.accp.pojo.RepairBill;

public interface RepairBillMapper {
    int deleteByPrimaryKey(Integer repairbillid);

    int insert(RepairBill record);

    int insertSelective(RepairBill record);

    RepairBill selectByPrimaryKey(Integer repairbillid);

    int updateByPrimaryKeySelective(RepairBill record);

    int updateByPrimaryKey(RepairBill record);
}