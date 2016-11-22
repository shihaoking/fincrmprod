/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.biz.shared.convertor;

import com.simon.fincrmprod.common.dal.model.SalesmanCustomerCountDo;
import com.simon.fincrmprod.service.facade.model.SalesmanCustomerCountModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinshihao
 * @version $Id: SalesmanCustomerCountConvertor.java, v 0.1 2016-11-22 15:52 jinshihao Exp $$
 */
public class SalesmanCustomerCountConvertor {
    public static SalesmanCustomerCountModel convert(SalesmanCustomerCountDo countDo){
        if(countDo == null){
            return  null;
        }

        SalesmanCustomerCountModel result = new SalesmanCustomerCountModel();
        result.setCustomerCount(countDo.getCustomerCount());
        result.setSalemanId(countDo.getSalesmanId());

        return result;
    }

    public static SalesmanCustomerCountDo convert(SalesmanCustomerCountModel salesmanCustomerCountModel){
        if(salesmanCustomerCountModel == null){
            return  null;
        }

        SalesmanCustomerCountDo result = new SalesmanCustomerCountDo();
        result.setCustomerCount(salesmanCustomerCountModel.getCustomerCount());
        result.setSalemanId(salesmanCustomerCountModel.getSalesmanId());

        return result;
    }

    public static List<SalesmanCustomerCountModel> convert(List<SalesmanCustomerCountDo> request){
        if(request == null){
            return null;
        }

        List<SalesmanCustomerCountModel> result = new ArrayList<SalesmanCustomerCountModel>();
        for (SalesmanCustomerCountDo item: request) {
            result.add(convert(item));
        }

        return result;
    }
}
