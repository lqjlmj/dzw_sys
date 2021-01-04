package com.accp.dao;

import com.accp.pojo.PaymentType;

public interface PaymentTypeMapper {
    int deleteByPrimaryKey(Integer paymenttypeid);

    int insert(PaymentType record);

    int insertSelective(PaymentType record);

    PaymentType selectByPrimaryKey(Integer paymenttypeid);

    int updateByPrimaryKeySelective(PaymentType record);

    int updateByPrimaryKey(PaymentType record);
}