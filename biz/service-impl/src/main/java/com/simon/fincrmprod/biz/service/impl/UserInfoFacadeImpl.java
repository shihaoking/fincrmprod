package com.simon.fincrmprod.biz.service.impl;


import com.simon.fincrmprod.biz.shared.convertor.PageInfoConvertor;
import com.simon.fincrmprod.biz.shared.convertor.SalesmanManagerRelationConvertor;
import com.simon.fincrmprod.biz.shared.convertor.SearchWithIdAndNameConvertor;
import com.simon.fincrmprod.biz.shared.convertor.UserInfoConvertor;
import com.simon.fincrmprod.biz.shared.service.SalesmanManagerReationService;
import com.simon.fincrmprod.biz.shared.service.UserInfoService;
import com.simon.fincrmprod.common.util.interceptor.PageInterceptor;
import com.simon.fincrmprod.service.facade.api.UserInfoFacade;
import com.simon.fincrmprod.service.facade.model.PageInfo;
import com.simon.fincrmprod.service.facade.model.SalesmanManagerRelationModel;
import com.simon.fincrmprod.service.facade.model.UserInfoModel;
import com.simon.fincrmprod.service.facade.request.CommonInfoQueryRequest;
import com.simon.fincrmprod.service.facade.result.SalesmanInfoWithManagerResult;
import com.simon.fincrmprod.service.facade.result.UserInfoQueryResult;
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

    public int insert(UserInfoModel record) {
        return userInfoService.insert(UserInfoConvertor.convert(record));
    }

    public int insertSelective(UserInfoModel record) {
        return userInfoService.insertSelective(UserInfoConvertor.convert(record));
    }

    public UserInfoModel selectByPrimaryKey(Integer id) {
        return UserInfoConvertor.convert(userInfoService.selectByPrimaryKey(id));
    }

    public UserInfoModel selectByName(String name) {
        return UserInfoConvertor.convert(userInfoService.selectByName(name));
    }

    public UserInfoQueryResult selectAll(CommonInfoQueryRequest request) {
        UserInfoQueryResult result = new UserInfoQueryResult();
        if(request.getPageSize() > 0) {
            PageInterceptor.startPage(request.getPageNum(), request.getPageSize());
        }

        List<UserInfoModel> userInfoModels =  UserInfoConvertor.convert(userInfoService.selectAll(request.getStatus()));
        PageInterceptor.Page page = PageInterceptor.endPage();

        result.setUserInfoModelList(userInfoModels);

        PageInfo pageInfo = PageInfoConvertor.convert(page);

        result.setPageInfo(pageInfo);

        return result;
    }

    public UserInfoQueryResult selectByManageId(CommonInfoQueryRequest request) {
        UserInfoQueryResult result = new UserInfoQueryResult();
        if(request.getPageSize() > 0) {
            PageInterceptor.startPage(request.getPageNum(), request.getPageSize());
        }

        List<UserInfoModel> userInfoModels = UserInfoConvertor.convert(userInfoService.selectByManageId(request.getId()));
        PageInterceptor.Page page = PageInterceptor.endPage();

        result.setUserInfoModelList(userInfoModels);

        PageInfo pageInfo = PageInfoConvertor.convert(page);

        result.setPageInfo(pageInfo);

        return result;
    }

    public UserInfoQueryResult selectByLevelId(CommonInfoQueryRequest request) {
        UserInfoQueryResult result = new UserInfoQueryResult();
        if(request.getPageSize() > 0) {
            PageInterceptor.startPage(request.getPageNum(), request.getPageSize());
        }

        List<UserInfoModel> userInfoModels = UserInfoConvertor.convert(userInfoService.selectByLevelId(request.getId()));
        PageInterceptor.Page page = PageInterceptor.endPage();

        result.setUserInfoModelList(userInfoModels);

        PageInfo pageInfo = PageInfoConvertor.convert(page);

        result.setPageInfo(pageInfo);

        return result;
    }

    public UserInfoQueryResult selectByManageIdAndSalesmanName(CommonInfoQueryRequest request) {
        UserInfoQueryResult result = new UserInfoQueryResult();
        if(request.getPageSize() > 0) {
            PageInterceptor.startPage(request.getPageNum(), request.getPageSize());
        }

        List<UserInfoModel> userInfoModels = UserInfoConvertor.convert(userInfoService.selectByManageIdAndSalesmanName(SearchWithIdAndNameConvertor.convert(request)));

        PageInterceptor.Page page = PageInterceptor.endPage();

        result.setUserInfoModelList(userInfoModels);

        PageInfo pageInfo = PageInfoConvertor.convert(page);

        result.setPageInfo(pageInfo);

        return result;
    }

    public UserInfoQueryResult selectByLevelIdAndName(CommonInfoQueryRequest request) {
        UserInfoQueryResult result = new UserInfoQueryResult();
        if(request.getPageSize() > 0) {
            PageInterceptor.startPage(request.getPageNum(), request.getPageSize());
        }

        List<UserInfoModel> userInfoModels = UserInfoConvertor.convert(userInfoService.selectByLevelIdAndName(SearchWithIdAndNameConvertor.convert(request)));
        PageInterceptor.Page page = PageInterceptor.endPage();

        result.setUserInfoModelList(userInfoModels);

        PageInfo pageInfo = PageInfoConvertor.convert(page);

        result.setPageInfo(pageInfo);

        return result;
    }

    public int updateByPrimaryKeySelective(UserInfoModel record) {
        return userInfoService.updateByPrimaryKeySelective(UserInfoConvertor.convert(record));
    }

    public int updateByPrimaryKey(UserInfoModel record) {
        return userInfoService.updateByPrimaryKey(UserInfoConvertor.convert(record));
    }

    public SalesmanInfoWithManagerResult getSalesmanInfoWithManager(Integer salesmanId) {
        SalesmanInfoWithManagerResult result = new SalesmanInfoWithManagerResult();

        try {
            UserInfoModel salesmanBaseInfo = UserInfoConvertor.convert(userInfoService.selectByPrimaryKey(salesmanId));

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

            SalesmanManagerRelationModel salesmanManagerRelationModel = SalesmanManagerRelationConvertor.convert(salesmanManagerReationService.selectBySalesmanId(salesmanId));

            result.setManagerId(salesmanManagerRelationModel.getManagerId());
        }catch (Exception ex){

        }

        return result;
    }
}
