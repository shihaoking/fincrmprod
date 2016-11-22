package com.simon.fincrmprod.biz.service.impl;


import com.simon.fincrmprod.biz.shared.service.SalesmanManagerReationService;
import com.simon.fincrmprod.biz.shared.service.UserInfoService;
import com.simon.fincrmprod.common.dal.model.SalesmanManagerReationDo;
import com.simon.fincrmprod.common.dal.model.SearchWithIdAndNameRequest;
import com.simon.fincrmprod.common.dal.model.UserInfoDo;
import com.simon.fincrmprod.service.facade.api.UserInfoFacade;
import com.simon.fincrmprod.service.facade.result.SalesmanInfoWithManagerResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by jinshihao on 16/8/24.
 */
@WebService(endpointInterface = "com.simon.fincrmprod.service.facade.api.UserInfoFacade")
@Service
public class UserInfoFacadeImpl implements UserInfoFacade {
    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private SalesmanManagerReationService salesmanManagerReationService;

    public int deleteByPrimaryKey(Integer id) {
        return userInfoService.deleteByPrimaryKey(id);
    }

    public int insert(UserInfoDo record) {
        return userInfoService.insert(record);
    }

    public int insertSelective(UserInfoDo record) {
        return userInfoService.insertSelective(record);
    }

    public UserInfoDo selectByPrimaryKey(Integer id) {
        return userInfoService.selectByPrimaryKey(id);
    }

    public UserInfoDo selectByName(String name) {
        return userInfoService.selectByName(name);
    }

    public List<UserInfoDo> selectAll(Boolean status) {
        return userInfoService.selectAll(status);
    }

    public List<UserInfoDo> selectByManageId(Integer managerId) {
        return userInfoService.selectByManageId(managerId);
    }

    public List<UserInfoDo> selectByLevelId(Integer levelId) {
        return userInfoService.selectByLevelId(levelId);
    }

    public List<UserInfoDo> selectByManageIdAndSalesmanName(SearchWithIdAndNameRequest request) {
        return userInfoService.selectByManageIdAndSalesmanName(request);
    }

    public List<UserInfoDo> selectByLevelIdAndName(SearchWithIdAndNameRequest request) {
        return userInfoService.selectByLevelIdAndName(request);
    }

    public int updateByPrimaryKeySelective(UserInfoDo record) {
        return userInfoService.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserInfoDo record) {
        return userInfoService.updateByPrimaryKey(record);
    }

    public SalesmanInfoWithManagerResult getSalesmanInfoWithManager(Integer salesmanId) {
        SalesmanInfoWithManagerResult result = new SalesmanInfoWithManagerResult();

        try {
            UserInfoDo salesmanBaseInfo = userInfoService.selectByPrimaryKey(salesmanId);

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

            SalesmanManagerReationDo salesmanManagerReationDo = salesmanManagerReationService.selectBySalesmanId(salesmanId);

            result.setManagerId(salesmanManagerReationDo.getManagerId());
        }catch (Exception ex){

        }

        return result;
    }
}
