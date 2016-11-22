package com.simon.fincrmprod.biz.shared.service;


import com.simon.fincrmprod.common.dal.model.SearchWithIdAndNameRequest;
import com.simon.fincrmprod.common.dal.model.UserInfoDo;
import com.simon.fincrmprod.service.facade.result.SalesmanInfoWithManagerResult;

import java.util.List;

/**
 * Created by jinshihao on 16/8/24.
 */
public interface UserInfoService {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfoDo record);

    int insertSelective(UserInfoDo record);

    UserInfoDo selectByPrimaryKey(Integer id);

    UserInfoDo selectByName(String name);

    List<UserInfoDo> selectAll(Boolean status);

    List<UserInfoDo> selectByManageId(Integer managerId);

    List<UserInfoDo> selectByLevelId(Integer levelId);

    List<UserInfoDo> selectByManageIdAndSalesmanName(SearchWithIdAndNameRequest request);

    List<UserInfoDo> selectByLevelIdAndName(SearchWithIdAndNameRequest request);

    int updateByPrimaryKeySelective(UserInfoDo record);

    int updateByPrimaryKey(UserInfoDo record);

    SalesmanInfoWithManagerResult getSalesmanInfoWithManager(Integer salesmanId);
}
