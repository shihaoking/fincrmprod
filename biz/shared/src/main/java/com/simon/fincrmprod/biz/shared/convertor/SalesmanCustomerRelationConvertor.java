/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.biz.shared.convertor;

import com.simon.fincrmprod.common.dal.model.SalesmanCustomerRelationDo;
import com.simon.fincrmprod.service.facade.model.SalesmanCustomerRelationModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinshihao
 * @version $Id: SalesmanCustomerRelationConvertor.java, v 0.1 2016-11-22 15:55 jinshihao Exp $$
 */
public class SalesmanCustomerRelationConvertor {
    public static SalesmanCustomerRelationModel convert(SalesmanCustomerRelationDo relationDo){

        if(relationDo == null){
            return null;
        }

        SalesmanCustomerRelationModel result = new SalesmanCustomerRelationModel();
        result.setId(relationDo.getId());
        result.setCustomerId(relationDo.getCustomerId());
        result.setSalesmanId(relationDo.getSalesmanId());

        return result;
    }

    public static SalesmanCustomerRelationDo convert(SalesmanCustomerRelationModel relationModel){

        if(relationModel == null){
            return null;
        }

        SalesmanCustomerRelationDo result = new SalesmanCustomerRelationDo();
        result.setId(relationModel.getId());
        result.setCustomerId(relationModel.getCustomerId());
        result.setSalesmanId(relationModel.getSalesmanId());

        return result;
    }

    public static List<SalesmanCustomerRelationModel> convert(List<SalesmanCustomerRelationDo> request){
        if(request == null){
            return null;
        }

        List<SalesmanCustomerRelationModel> result = new ArrayList<SalesmanCustomerRelationModel>();
        for (SalesmanCustomerRelationDo item: request) {
            result.add(convert(item));
        }

        return result;
    }
}
