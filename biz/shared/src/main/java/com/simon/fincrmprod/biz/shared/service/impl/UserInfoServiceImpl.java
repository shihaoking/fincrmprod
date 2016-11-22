package com.simon.fincrmprod.biz.shared.service.impl;


import com.simon.fincrmprod.biz.shared.service.UserInfoService;
import com.simon.fincrmprod.common.dal.dao.SalesmanManagerReationDao;
import com.simon.fincrmprod.common.dal.dao.UserInfoDao;
import com.simon.fincrmprod.common.dal.model.SalesmanManagerReationDo;
import com.simon.fincrmprod.common.dal.model.SearchWithIdAndNameRequest;
import com.simon.fincrmprod.common.dal.model.UserInfoDo;
import com.simon.fincrmprod.service.facade.result.SalesmanInfoWithManagerResult;
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

    public List<UserInfoDo> selectByManageIdAndSalesmanName(SearchWithIdAndNameRequest request) {
        return userInfoDao.selectByManageIdAndSalesmanName(request);
    }

    public List<UserInfoDo> selectByLevelIdAndName(SearchWithIdAndNameRequest request) {
        return userInfoDao.selectByLevelIdAndName(request);
    }

    public int updateByPrimaryKeySelective(UserInfoDo record) {
        return userInfoDao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserInfoDo record) {
        return userInfoDao.updateByPrimaryKey(record);
    }

    public SalesmanInfoWithManagerResult getSalesmanInfoWithManager(Integer salesmanId) {
        SalesmanInfoWithManagerResult result = new SalesmanInfoWithManagerResult();

        try {
            UserInfoDo salesmanBaseInfo = userInfoDao.selectByPrimaryKey(salesmanId);

            result.setSalesmanId(salesmanBaseInfo.getId());
            result.setUserName(salesmanBaseInfo.getUserName());
            result.setEmail(salesmanBaseInfo.getEmail());
            result.setPhonenumber(salesmanBaseInfo.getPhonenumber());
            result.setGender(salesmanBaseInfo.getGender());
            result.setAddress(salesmanBaseInfo.getAddress());
            result.setBirthday(salesmanBaseInfo.getBirthday());
            result.setUserPwd(salesmanBaseInfo.getUserPwd());
            result.setStatus(salesmanBaseInfo.getStatus());
            result.setCreateTime(salesmanBaseInfo.getCreateTime());

            SalesmanManagerReationDo salesmanManagerReationDo = salesmanManagerReationDao.selectBySalesmanId(salesmanId);

            result.setManagerId(salesmanManagerReationDo.getManagerId());
        }catch (Exception ex){

        }

        return result;
    }
}
