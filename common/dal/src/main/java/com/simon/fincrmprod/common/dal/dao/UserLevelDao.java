package com.simon.fincrmprod.common.dal.dao;


import com.simon.fincrmprod.common.dal.model.UserLevelDo;

public interface UserLevelDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserLevelDo record);

    int insertSelective(UserLevelDo record);

    UserLevelDo selectByPrimaryKey(Integer id);

    UserLevelDo selectByUserId(Integer id);

    int updateByPrimaryKeySelective(UserLevelDo record);

    int updateByPrimaryKey(UserLevelDo record);
}