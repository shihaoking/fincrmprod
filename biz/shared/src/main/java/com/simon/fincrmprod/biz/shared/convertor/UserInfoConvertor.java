/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.biz.shared.convertor;

import com.simon.fincrmprod.common.dal.model.UserInfoDo;
import com.simon.fincrmprod.service.facade.model.UserInfoModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinshihao
 * @version $Id: UserInfoConvertor.java, v 0.1 2016-11-22 16:02 jinshihao Exp $$
 */
public class UserInfoConvertor {
    public static UserInfoModel convert(UserInfoDo userInfoDo){
        if(userInfoDo == null){
            return null;
        }

        UserInfoModel result = new UserInfoModel();
        result.setCreateTime(userInfoDo.getCreateTime());
        result.setStatus(userInfoDo.getStatus());
        result.setId(userInfoDo.getId());
        result.setAddress(userInfoDo.getAddress());
        result.setBirthday(userInfoDo.getBirthday());
        result.setEmail(userInfoDo.getEmail());
        result.setGender(userInfoDo.getStatus());
        result.setPhonenumber(userInfoDo.getPhonenumber());
        result.setUpdateTime(userInfoDo.getUpdateTime());
        result.setUserName(userInfoDo.getUserName());
        result.setUserPwd(userInfoDo.getUserPwd());

        return result;
    }

    public static UserInfoDo convert(UserInfoModel userInfoModel){
        if(userInfoModel == null){
            return null;
        }

        UserInfoDo result = new UserInfoDo();
        result.setCreateTime(userInfoModel.getCreateTime());
        result.setStatus(userInfoModel.getStatus());
        result.setId(userInfoModel.getId());
        result.setAddress(userInfoModel.getAddress());
        result.setBirthday(userInfoModel.getBirthday());
        result.setEmail(userInfoModel.getEmail());
        result.setGender(userInfoModel.getStatus());
        result.setPhonenumber(userInfoModel.getPhonenumber());
        result.setUpdateTime(userInfoModel.getUpdateTime());
        result.setUserName(userInfoModel.getUserName());
        result.setUserPwd(userInfoModel.getUserPwd());

        return result;
    }

    public static List<UserInfoModel> convert(List<UserInfoDo> request){
        if(request == null){
            return null;
        }

        List<UserInfoModel> result = new ArrayList<UserInfoModel>();
        for (UserInfoDo item: request) {
            result.add(convert(item));
        }

        return result;
    }
}
