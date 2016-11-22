package com.simon.fincrmprod.common.dal.dao;


import com.simon.fincrmprod.common.dal.model.SearchWithIdAndNameDo;
import com.simon.fincrmprod.common.dal.model.UserInfoDo;

import java.util.List;

public interface UserInfoDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfoDo record);

    int insertSelective(UserInfoDo record);

    UserInfoDo selectByPrimaryKey(Integer id);

    UserInfoDo selectByName(String name);

    List<UserInfoDo> selectAll(Boolean status);

    List<UserInfoDo> selectByManageId(Integer managerId);

    List<UserInfoDo> selectByLevelId(Integer levelId);

    List<UserInfoDo> selectByManageIdAndSalesmanName(SearchWithIdAndNameDo request);

    List<UserInfoDo> selectByLevelIdAndName(SearchWithIdAndNameDo request);

    int updateByPrimaryKeySelective(UserInfoDo record);

    int updateByPrimaryKey(UserInfoDo record);
}