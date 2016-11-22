/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.biz.service.impl;

import com.simon.fincrmprod.biz.shared.convertor.SalesmanManagerRelationConvertor;
import com.simon.fincrmprod.biz.shared.service.SalesmanManagerReationService;
import com.simon.fincrmprod.service.facade.api.SalesmanManagerReationFacade;
import com.simon.fincrmprod.service.facade.model.SalesmanManagerRelationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * @author jinshihao
 * @version $Id: SalesmanManagerRelationImpl.java, v 0.1 2016-09-13 16:13 jinshihao Exp $$
 */
@WebService(endpointInterface = "com.simon.fincrmprod.service.facade.api.SalesmanManagerReationFacade")
@Service
public class SalesmanManagerRelationFacadeImpl implements SalesmanManagerReationFacade {

    @Autowired
    private SalesmanManagerReationService salesmanManagerReationService;

    public int deleteByPrimaryKey(Integer id) {
        return salesmanManagerReationService.deleteByPrimaryKey(id);
    }

    public int insert(SalesmanManagerRelationModel record) {
        return salesmanManagerReationService.insert(SalesmanManagerRelationConvertor
            .convert(record));
    }

    public int insertSelective(SalesmanManagerRelationModel record) {
        return salesmanManagerReationService.insertSelective(SalesmanManagerRelationConvertor
            .convert(record));
    }

    public SalesmanManagerRelationModel selectByPrimaryKey(Integer id) {
        return SalesmanManagerRelationConvertor.convert(salesmanManagerReationService
            .selectByPrimaryKey(id));
    }

    public SalesmanManagerRelationModel selectBySalesmanId(Integer id) {
        return SalesmanManagerRelationConvertor.convert(salesmanManagerReationService.selectBySalesmanId(id));
    }

    public int updateByPrimaryKeySelective(SalesmanManagerRelationModel record) {
        return salesmanManagerReationService
            .updateByPrimaryKeySelective(SalesmanManagerRelationConvertor.convert(record));
    }

    public int updateByPrimaryKey(SalesmanManagerRelationModel record) {
        return salesmanManagerReationService.updateByPrimaryKey(SalesmanManagerRelationConvertor
            .convert(record));
    }
}
