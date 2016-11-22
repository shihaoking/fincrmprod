/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.biz.shared.service.impl;


import com.simon.fincrmprod.biz.shared.service.UserLevelService;
import com.simon.fincrmprod.common.dal.dao.UserLevelDao;
import com.simon.fincrmprod.common.dal.model.UserLevelDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jinshihao
 * @version $Id: UserLevelServiceImpl.java, v 0.1 2016-09-13 19:10 jinshihao Exp $$
 */
@Service
public class UserLevelServiceImpl implements UserLevelService {
    @Autowired
    private UserLevelDao userLevelDao;

    public int deleteByPrimaryKey(Integer id) {
        return userLevelDao.deleteByPrimaryKey(id);
    }

    public int insert(UserLevelDo record) {
        return userLevelDao.insert(record);
    }

    public int insertSelective(UserLevelDo record) {
        return userLevelDao.insertSelective(record);
    }

    public UserLevelDo selectByPrimaryKey(Integer id) {
        return userLevelDao.selectByPrimaryKey(id);
    }

    public UserLevelDo selectByUserId(Integer id) {
        return userLevelDao.selectByUserId(id);
    }

    public int updateByPrimaryKeySelective(UserLevelDo record) {
        return userLevelDao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserLevelDo record) {
        return userLevelDao.updateByPrimaryKey(record);
    }
}
