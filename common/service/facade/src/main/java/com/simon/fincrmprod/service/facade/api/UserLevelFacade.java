package com.simon.fincrmprod.service.facade.api;


import com.simon.fincrmprod.common.dal.model.UserLevelDo;

import javax.jws.WebService;

/**
 * Created by jinshihao on 16/8/24.
 */
@WebService
public interface UserLevelFacade {
    int deleteByPrimaryKey(Integer id);

    int insert(UserLevelDo record);

    int insertSelective(UserLevelDo record);

    UserLevelDo selectByPrimaryKey(Integer id);

    UserLevelDo selectByUserId(Integer id);

    int updateByPrimaryKeySelective(UserLevelDo record);

    int updateByPrimaryKey(UserLevelDo record);
}
