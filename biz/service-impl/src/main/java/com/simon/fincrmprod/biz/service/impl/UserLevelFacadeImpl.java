/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.biz.service.impl;


import com.simon.fincrmprod.biz.shared.service.UserLevelService;
import com.simon.fincrmprod.common.dal.model.UserLevelDo;
import com.simon.fincrmprod.service.facade.api.UserLevelFacade;
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

    public int insert(UserLevelDo record) {
        return userLevelService.insert(record);
    }

    public int insertSelective(UserLevelDo record) {
        return userLevelService.insertSelective(record);
    }

    public UserLevelDo selectByPrimaryKey(Integer id) {
        return userLevelService.selectByPrimaryKey(id);
    }

    public UserLevelDo selectByUserId(Integer id) {
        return userLevelService.selectByUserId(id);
    }

    public int updateByPrimaryKeySelective(UserLevelDo record) {
        return userLevelService.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserLevelDo record) {
        return userLevelService.updateByPrimaryKey(record);
    }
}
