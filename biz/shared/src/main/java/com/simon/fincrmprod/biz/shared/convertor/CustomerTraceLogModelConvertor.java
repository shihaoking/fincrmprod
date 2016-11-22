/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.biz.shared.convertor;

import com.simon.fincrmprod.common.dal.model.CustomerTraceLogDo;
import com.simon.fincrmprod.service.facade.model.CustomerTraceLogModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinshihao
 * @version $Id: CustomerTraceLogModelConvertor.java, v 0.1 2016-11-22 15:47 jinshihao Exp $$
 */
public class CustomerTraceLogModelConvertor {
    public static CustomerTraceLogModel convert(CustomerTraceLogDo customerTraceLogDo){
        if(customerTraceLogDo == null){
            return null;
        }

        CustomerTraceLogModel customerTraceLogModel = new CustomerTraceLogModel();
        customerTraceLogModel.setCreateTime(customerTraceLogDo.getCreateTime());
        customerTraceLogModel.setStatus(customerTraceLogDo.getStatus());
        customerTraceLogModel.setCreator(customerTraceLogDo.getCreator());
        customerTraceLogModel.setCreatorName(customerTraceLogDo.getCreatorName());
        customerTraceLogModel.setStatus(customerTraceLogDo.getStatus());
        customerTraceLogModel.setId(customerTraceLogDo.getId());
        customerTraceLogModel.setReportInfo(customerTraceLogDo.getReportInfo());
        customerTraceLogModel.setReportSalesman(customerTraceLogDo.getReportSalesman());
        customerTraceLogModel.setReportSalesmanId(customerTraceLogDo.getReportSalesmanId());

        return customerTraceLogModel;
    }

    public static CustomerTraceLogDo convert(CustomerTraceLogModel customerTraceLogModel){
        if(customerTraceLogModel == null){
            return null;
        }

        CustomerTraceLogDo customerTraceLogDo = new CustomerTraceLogDo();
        customerTraceLogDo.setCreateTime(customerTraceLogModel.getCreateTime());
        customerTraceLogDo.setStatus(customerTraceLogModel.getStatus());
        customerTraceLogDo.setCreator(customerTraceLogModel.getCreator());
        customerTraceLogDo.setCreatorName(customerTraceLogModel.getCreatorName());
        customerTraceLogDo.setStatus(customerTraceLogModel.getStatus());
        customerTraceLogDo.setId(customerTraceLogModel.getId());
        customerTraceLogDo.setReportInfo(customerTraceLogModel.getReportInfo());
        customerTraceLogDo.setReportSalesman(customerTraceLogModel.getReportSalesman());
        customerTraceLogDo.setReportSalesmanId(customerTraceLogModel.getReportSalesmanId());

        return customerTraceLogDo;
    }

    public static List<CustomerTraceLogModel> convert(List<CustomerTraceLogDo> request){
        if(request == null){
            return null;
        }

        List<CustomerTraceLogModel> result = new ArrayList<CustomerTraceLogModel>();
        for (CustomerTraceLogDo item: request) {
            result.add(convert(item));
        }

        return result;
    }
}
