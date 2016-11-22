package com.simon.fincrmprod.common.dal.dao;


import com.simon.fincrmprod.common.dal.model.LevelInfoDo;

public interface LevelInfoDao {
    int deleteByPrimaryKey(Integer id);

    int insert(LevelInfoDo record);

    int insertSelective(LevelInfoDo record);

    LevelInfoDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LevelInfoDo record);

    int updateByPrimaryKey(LevelInfoDo record);
}