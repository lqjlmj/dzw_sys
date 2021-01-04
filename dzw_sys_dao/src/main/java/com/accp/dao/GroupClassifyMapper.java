package com.accp.dao;

import com.accp.pojo.GroupClassify;

public interface GroupClassifyMapper {
    int deleteByPrimaryKey(Integer gclassifyid);

    int insert(GroupClassify record);

    int insertSelective(GroupClassify record);

    GroupClassify selectByPrimaryKey(Integer gclassifyid);

    int updateByPrimaryKeySelective(GroupClassify record);

    int updateByPrimaryKey(GroupClassify record);
}