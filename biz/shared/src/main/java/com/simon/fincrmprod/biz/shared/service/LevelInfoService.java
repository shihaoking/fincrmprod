package com.simon.fincrmprod.biz.shared.service;

import com.simon.fincrmprod.common.dal.model.LevelInfoDo;

/**
 * Created by jinshihao on 16/8/24.
 */
public interface LevelInfoService {
    int deleteByPrimaryKey(Integer id);

    int insert(LevelInfoDo record);

    int insertSelective(LevelInfoDo record);

    LevelInfoDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LevelInfoDo record);

    int updateByPrimaryKey(LevelInfoDo record);
}
