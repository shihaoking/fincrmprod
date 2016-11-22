/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.biz.service.impl;


import com.simon.fincrmprod.biz.shared.convertor.UserLevelConvertor;
import com.simon.fincrmprod.biz.shared.service.UserLevelService;
import com.simon.fincrmprod.service.facade.api.UserLevelFacade;
import com.simon.fincrmprod.service.facade.model.UserLevelModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * @author jinshihao
 * @version $Id: UserLevelFacadeImpl.java, v 0.1 2016-09-13 19:10 jinshihao Exp $$
 */
@WebService(endpointInterface = "com.simon.fincrmprod.service.facade.api.UserLevelFacade")
@Service
public class UserLevelFacadeImpl implements UserLevelFacade {
    @Autowired
    private UserLevelService userLevelService;

    public int deleteByPrimaryKey(Integer id) {
        return userLevelService.deleteByPrimaryKey(id);
    }

    public int insert(UserLevelModel record) {
        return userLevelService.insert(UserLevelConvertor.convert(record));
    }

    public int insertSelective(UserLevelModel record) {
        return userLevelService.insertSelective(UserLevelConvertor.convert(record));
    }

    public UserLevelModel selectByPrimaryKey(Integer id) {
        return UserLevelConvertor.convert(userLevelService.selectByPrimaryKey(id));
    }

    public UserLevelModel selectByUserId(Integer id) {
        return UserLevelConvertor.convert(userLevelService.selectByUserId(id));
    }

    public int updateByPrimaryKeySelective(UserLevelModel record) {
        return userLevelService.updateByPrimaryKeySelective(UserLevelConvertor.convert(record));
    }

    public int updateByPrimaryKey(UserLevelModel record) {
        return userLevelService.updateByPrimaryKey(UserLevelConvertor.convert(record));
    }
}
