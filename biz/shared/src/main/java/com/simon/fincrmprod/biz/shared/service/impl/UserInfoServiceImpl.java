package com.simon.fincrmprod.biz.shared.service.impl;


import com.simon.fincrmprod.biz.shared.service.UserInfoService;
import com.simon.fincrmprod.common.dal.dao.SalesmanManagerReationDao;
import com.simon.fincrmprod.common.dal.dao.UserInfoDao;
import com.simon.fincrmprod.common.dal.model.SearchWithIdAndNameDo;
import com.simon.fincrmprod.common.dal.model.UserInfoDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jinshihao on 16/8/24.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;

    @Autowired
    private SalesmanManagerReationDao salesmanManagerReationDao;

    public int deleteByPrimaryKey(Integer id) {
        return userInfoDao.deleteByPrimaryKey(id);
    }

    public int insert(UserInfoDo record) {
        return userInfoDao.insert(record);
    }

    public int insertSelective(UserInfoDo record) {
        return userInfoDao.insertSelective(record);
    }

    public UserInfoDo selectByPrimaryKey(Integer id) {
        return userInfoDao.selectByPrimaryKey(id);
    }

    public UserInfoDo selectByName(String name) {
        return userInfoDao.selectByName(name);
    }

    public List<UserInfoDo> selectAll(Boolean status) {
        return userInfoDao.selectAll(status);
    }

    public List<UserInfoDo> selectByManageId(Integer managerId) {
        return userInfoDao.selectByManageId(managerId);
    }

    public List<UserInfoDo> selectByLevelId(Integer levelId) {
        return userInfoDao.selectByLevelId(levelId);
    }

    public List<UserInfoDo> selectByManageIdAndSalesmanName(SearchWithIdAndNameDo request) {
        return userInfoDao.selectByManageIdAndSalesmanName(request);
    }

    public List<UserInfoDo> selectByLevelIdAndName(SearchWithIdAndNameDo request) {
        return userInfoDao.selectByLevelIdAndName(request);
    }

    public int updateByPrimaryKeySelective(UserInfoDo record) {
        return userInfoDao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserInfoDo record) {
        return userInfoDao.updateByPrimaryKey(record);
    }
}
