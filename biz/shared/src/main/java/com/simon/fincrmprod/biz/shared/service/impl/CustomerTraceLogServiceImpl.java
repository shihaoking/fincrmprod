/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.biz.shared.service.impl;


import com.simon.fincrmprod.biz.shared.service.CustomerTraceLogService;
import com.simon.fincrmprod.common.dal.dao.CustomerTraceLogDao;
import com.simon.fincrmprod.common.dal.model.CustomerTraceLogDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jinshihao
 * @version $Id: CustomerTraceLogServiceImpl.java, v 0.1 2016-09-12 17:43 jinshihao Exp $$
 */
@Service
public class CustomerTraceLogServiceImpl implements CustomerTraceLogService {

    @Autowired
    private CustomerTraceLogDao customerTraceLogDao;

    public int deleteByPrimaryKey(Integer id) {
        return customerTraceLogDao.deleteByPrimaryKey(id);
    }

    public int insert(CustomerTraceLogDo record) {
        return customerTraceLogDao.insert(record);
    }

    public int insertSelective(CustomerTraceLogDo record) {
        return customerTraceLogDao.insertSelective(record);
    }

    public CustomerTraceLogDo selectByPrimaryKey(Integer id) {
        return customerTraceLogDao.selectByPrimaryKey(id);
    }

    public List<CustomerTraceLogDo> selectByCustomerId(Integer customerId) {
        return customerTraceLogDao.selectByCustomerId(customerId);
    }

    public List<CustomerTraceLogDo> selectBySalesmanId(Integer salesmanId) {
        return customerTraceLogDao.selectBySalesmanId(salesmanId);
    }

    public List<CustomerTraceLogDo> selectByManagerId(Integer managerId) {
        return customerTraceLogDao.selectByManagerId(managerId);
    }


    public int updateByPrimaryKeySelective(CustomerTraceLogDo record) {
        return customerTraceLogDao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(CustomerTraceLogDo record) {
        return customerTraceLogDao.updateByPrimaryKey(record);
    }
}
