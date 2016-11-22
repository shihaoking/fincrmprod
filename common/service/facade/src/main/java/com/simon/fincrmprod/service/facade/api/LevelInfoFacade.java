package com.simon.fincrmprod.service.facade.api;

import com.simon.fincrmprod.common.dal.model.LevelInfoDo;

import javax.jws.WebService;

/**
 * Created by jinshihao on 16/8/24.
 */
@WebService
public interface LevelInfoFacade {
    int deleteByPrimaryKey(Integer id);

    int insert(LevelInfoDo record);

    int insertSelective(LevelInfoDo record);

    LevelInfoDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LevelInfoDo record);

    int updateByPrimaryKey(LevelInfoDo record);
}
