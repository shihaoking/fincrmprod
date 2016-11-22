package com.simon.fincrmprod.biz.shared.service;


import com.simon.fincrmprod.common.dal.model.UserLevelDo;

/**
 * Created by jinshihao on 16/8/24.
 */
public interface UserLevelService {
    int deleteByPrimaryKey(Integer id);

    int insert(UserLevelDo record);

    int insertSelective(UserLevelDo record);

    UserLevelDo selectByPrimaryKey(Integer id);

    UserLevelDo selectByUserId(Integer id);

    int updateByPrimaryKeySelective(UserLevelDo record);

    int updateByPrimaryKey(UserLevelDo record);
}
