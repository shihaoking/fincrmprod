/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.biz.shared.convertor;

import com.simon.fincrmprod.common.dal.model.SalesmanManagerRelationDo;
import com.simon.fincrmprod.service.facade.model.SalesmanManagerRelationModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinshihao
 * @version $Id: SalesmanManagerRelationConvertor.java, v 0.1 2016-11-22 15:57 jinshihao Exp $$
 */
public class SalesmanManagerRelationConvertor {
    public static SalesmanManagerRelationModel convert(SalesmanManagerRelationDo relationDo){
        if(relationDo == null){
            return null;
        }

        SalesmanManagerRelationModel result = new SalesmanManagerRelationModel();
        result.setSalesmanId(relationDo.getSalesmanId());
        result.setId(relationDo.getId());
        result.setManagerId(relationDo.getManagerId());
        result.setStatus(relationDo.getStatus());

        return result;
    }

    public static SalesmanManagerRelationDo convert(SalesmanManagerRelationModel relationModel){
        if(relationModel == null){
            return null;
        }

        SalesmanManagerRelationDo result = new SalesmanManagerRelationDo();
        result.setSalesmanId(relationModel.getSalesmanId());
        result.setId(relationModel.getId());
        result.setManagerId(relationModel.getManagerId());
        result.setStatus(relationModel.getStatus());

        return result;
    }

    public static List<SalesmanManagerRelationModel> convert(List<SalesmanManagerRelationDo> request){
        if(request == null){
            return null;
        }

        List<SalesmanManagerRelationModel> result = new ArrayList<SalesmanManagerRelationModel>();
        for (SalesmanManagerRelationDo item: request) {
            result.add(convert(item));
        }

        return result;
    }
}
