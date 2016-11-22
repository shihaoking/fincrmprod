/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.biz.service.impl;


import com.simon.fincrmprod.biz.shared.convertor.CustomerTraceLogModelConvertor;
import com.simon.fincrmprod.biz.shared.convertor.PageInfoConvertor;
import com.simon.fincrmprod.biz.shared.service.CustomerTraceLogService;
import com.simon.fincrmprod.common.util.interceptor.PageInterceptor;
import com.simon.fincrmprod.service.facade.api.CustomerTraceLogFacade;
import com.simon.fincrmprod.service.facade.model.CustomerTraceLogModel;
import com.simon.fincrmprod.service.facade.model.PageInfo;
import com.simon.fincrmprod.service.facade.request.CommonInfoQueryRequest;
import com.simon.fincrmprod.service.facade.result.CustomerTraceLogQueryResult;
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

    public int insert(CustomerTraceLogModel record) {
        return customerTraceLogService.insert(CustomerTraceLogModelConvertor.convert(record));
    }

    public int insertSelective(CustomerTraceLogModel record) {
        return customerTraceLogService.insertSelective(CustomerTraceLogModelConvertor.convert(record));
    }

    public CustomerTraceLogModel selectByPrimaryKey(Integer id) {
        return CustomerTraceLogModelConvertor.convert(customerTraceLogService.selectByPrimaryKey(id));
    }

    public CustomerTraceLogQueryResult selectByCustomerId(CommonInfoQueryRequest request) {
        CustomerTraceLogQueryResult result = new CustomerTraceLogQueryResult();
        if(request.getPageSize() > 0) {
            PageInterceptor.startPage(request.getPageNum(), request.getPageSize());
        }


        List<CustomerTraceLogModel> customerTraceLogModels = CustomerTraceLogModelConvertor.convert(customerTraceLogService.selectByCustomerId(request.getId()));
        PageInterceptor.Page page = PageInterceptor.endPage();

        result.setCustomerTraceLogModelList(customerTraceLogModels);

        PageInfo pageInfo = PageInfoConvertor.convert(page);

        result.setPageInfo(pageInfo);

        return result;
    }

    public CustomerTraceLogQueryResult selectBySalesmanId(CommonInfoQueryRequest request) {
        CustomerTraceLogQueryResult result = new CustomerTraceLogQueryResult();
        if(request.getPageSize() > 0) {
            PageInterceptor.startPage(request.getPageNum(), request.getPageSize());
        }

        List<CustomerTraceLogModel> customerTraceLogModels = CustomerTraceLogModelConvertor.convert(customerTraceLogService.selectBySalesmanId(request.getId()));
        PageInterceptor.Page page = PageInterceptor.endPage();

        result.setCustomerTraceLogModelList(customerTraceLogModels);

        PageInfo pageInfo = PageInfoConvertor.convert(page);

        result.setPageInfo(pageInfo);

        return result;
    }

    public CustomerTraceLogQueryResult selectByManagerId(CommonInfoQueryRequest request) {
        CustomerTraceLogQueryResult result = new CustomerTraceLogQueryResult();
        if(request.getPageSize() > 0) {
            PageInterceptor.startPage(request.getPageNum(), request.getPageSize());
        }

        List<CustomerTraceLogModel> customerTraceLogModels = CustomerTraceLogModelConvertor.convert(customerTraceLogService.selectByManagerId(request.getId()));
        PageInterceptor.Page page = PageInterceptor.endPage();

        result.setCustomerTraceLogModelList(customerTraceLogModels);

        PageInfo pageInfo = PageInfoConvertor.convert(page);

        result.setPageInfo(pageInfo);

        return result;
    }


    public int updateByPrimaryKeySelective(CustomerTraceLogModel record) {
        return customerTraceLogService.updateByPrimaryKeySelective(CustomerTraceLogModelConvertor.convert(record));
    }

    public int updateByPrimaryKey(CustomerTraceLogModel record) {
        return customerTraceLogService.updateByPrimaryKey(CustomerTraceLogModelConvertor.convert(record));
    }
}
