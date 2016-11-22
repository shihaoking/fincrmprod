package com.simon.fincrmprod.service.facade.api;

import com.simon.fincrmprod.service.facade.model.LevelInfoModel;

import javax.jws.WebService;

/**
 * Created by jinshihao on 16/8/24.
 */
@WebService
public interface LevelInfoFacade {
    int deleteByPrimaryKey(Integer id);

    int insert(LevelInfoModel record);

    int insertSelective(LevelInfoModel record);

    LevelInfoModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LevelInfoModel record);

    int updateByPrimaryKey(LevelInfoModel record);
}
