/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.biz.service.impl;


import com.simon.fincrmprod.biz.shared.service.CustomerTraceLogService;
import com.simon.fincrmprod.common.dal.model.CustomerTraceLogDo;
import com.simon.fincrmprod.service.facade.api.CustomerTraceLogFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.List;

/**
 * @author jinshihao
 * @version $Id: CustomerTraceLogFacadeImpl.java, v 0.1 2016-09-12 17:43 jinshihao Exp $$
 */
@WebService(endpointInterface = "com.simon.fincrmprod.service.facade.api.CustomerTraceLogFacade")
@Service
public class CustomerTraceLogFacadeImpl implements CustomerTraceLogFacade {

    @Autowired
    private CustomerTraceLogService customerTraceLogService;

    public int deleteByPrimaryKey(Integer id) {
        return customerTraceLogService.deleteByPrimaryKey(id);
    }

    public int insert(CustomerTraceLogDo record) {
        return customerTraceLogService.insert(record);
    }

    public int insertSelective(CustomerTraceLogDo record) {
        return customerTraceLogService.insertSelective(record);
    }

    public CustomerTraceLogDo selectByPrimaryKey(Integer id) {
        return customerTraceLogService.selectByPrimaryKey(id);
    }

    public List<CustomerTraceLogDo> selectByCustomerId(Integer customerId) {
        return customerTraceLogService.selectByCustomerId(customerId);
    }

    public List<CustomerTraceLogDo> selectBySalesmanId(Integer salesmanId) {
        return customerTraceLogService.selectBySalesmanId(salesmanId);
    }

    public List<CustomerTraceLogDo> selectByManagerId(Integer managerId) {
        return customerTraceLogService.selectByManagerId(managerId);
    }


    public int updateByPrimaryKeySelective(CustomerTraceLogDo record) {
        return customerTraceLogService.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(CustomerTraceLogDo record) {
        return customerTraceLogService.updateByPrimaryKey(record);
    }
}
