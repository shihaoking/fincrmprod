/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.biz.shared.convertor;

import com.simon.fincrmprod.common.dal.model.UserLevelDo;
import com.simon.fincrmprod.service.facade.model.UserLevelModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinshihao
 * @version $Id: UserLevelConvertor.java, v 0.1 2016-11-22 16:04 jinshihao Exp $$
 */
public class UserLevelConvertor {
    public static UserLevelModel convert(UserLevelDo userLevelDo){
        if(userLevelDo == null){
            return null;
        }

        UserLevelModel result = new UserLevelModel();
        result.setId(userLevelDo.getId());
        result.setLevelId(userLevelDo.getLevelId());
        result.setLevelName(userLevelDo.getLevelName());
        result.setUserId(userLevelDo.getUserId());

        return result;
    }

    public static UserLevelDo convert(UserLevelModel userLevelModel){
        if(userLevelModel == null){
            return null;
        }

        UserLevelDo result = new UserLevelDo();
        result.setId(userLevelModel.getId());
        result.setLevelId(userLevelModel.getLevelId());
        result.setLevelName(userLevelModel.getLevelName());
        result.setUserId(userLevelModel.getUserId());

        return result;
    }

    public static List<UserLevelModel> convert(List<UserLevelDo> request){
        if(request == null){
            return null;
        }

        List<UserLevelModel> result = new ArrayList<UserLevelModel>();
        for (UserLevelDo item: request) {
            result.add(convert(item));
        }

        return result;
    }
}
