/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.biz.shared.convertor;

import com.simon.fincrmprod.common.dal.model.CustomerInfoDo;
import com.simon.fincrmprod.service.facade.model.CustomerInfoModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinshihao
 * @version $Id: CustomerInfoConvertor.java, v 0.1 2016-11-22 15:18 jinshihao Exp $$
 */
public class CustomerInfoConvertor {
    public static CustomerInfoModel convert(CustomerInfoDo customerInfoDo){
        if(customerInfoDo == null){
            return null;
        }

        CustomerInfoModel customerInfoModel = new CustomerInfoModel();
        customerInfoModel.setId(customerInfoDo.getId());
        customerInfoModel.setCreateTime(customerInfoDo.getCreateTime());
        customerInfoModel.setCreator(customerInfoDo.getCreator());
        customerInfoModel.setCustomerName(customerInfoDo.getCustomerName());
        customerInfoModel.setEmail(customerInfoDo.getEmail());
        customerInfoModel.setPhoneNumber(customerInfoDo.getPhoneNumber());
        customerInfoModel.setStatus(customerInfoDo.getStatus());

        return customerInfoModel;
    }

    public static CustomerInfoDo convert(CustomerInfoModel customerInfoModel){
        if(customerInfoModel == null){
            return null;
        }

        CustomerInfoDo customerInfoDo = new CustomerInfoDo();
        customerInfoDo.setId(customerInfoModel.getId());
        customerInfoDo.setCreateTime(customerInfoModel.getCreateTime());
        customerInfoDo.setCreator(customerInfoModel.getCreator());
        customerInfoDo.setCustomerName(customerInfoModel.getCustomerName());
        customerInfoDo.setEmail(customerInfoModel.getEmail());
        customerInfoDo.setPhoneNumber(customerInfoModel.getPhoneNumber());
        customerInfoDo.setStatus(customerInfoModel.getStatus());

        return customerInfoDo;
    }

    public static List<CustomerInfoModel> convert(List<CustomerInfoDo> request){
        if(request == null){
            return null;
        }

        List<CustomerInfoModel> result = new ArrayList<CustomerInfoModel>();
        for (CustomerInfoDo item: request) {
            result.add(convert(item));
        }

        return result;
    }
}
