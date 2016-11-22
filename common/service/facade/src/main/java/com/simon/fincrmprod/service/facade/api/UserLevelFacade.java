package com.simon.fincrmprod.service.facade.api;

import com.simon.fincrmprod.service.facade.model.UserLevelModel;

import javax.jws.WebService;

/**
 * Created by jinshihao on 16/8/24.
 */
@WebService
public interface UserLevelFacade {
    int deleteByPrimaryKey(Integer id);

    int insert(UserLevelModel record);

    int insertSelective(UserLevelModel record);

    UserLevelModel selectByPrimaryKey(Integer id);

    UserLevelModel selectByUserId(Integer id);

    int updateByPrimaryKeySelective(UserLevelModel record);

    int updateByPrimaryKey(UserLevelModel record);
}
