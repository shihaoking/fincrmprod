/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.biz.service.impl;


import com.simon.fincrmprod.biz.shared.service.SalesmanManagerReationService;
import com.simon.fincrmprod.common.dal.model.SalesmanManagerReationDo;
import com.simon.fincrmprod.service.facade.api.SalesmanManagerReationFacade;
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

    public int insert(SalesmanManagerReationDo record) {
        return salesmanManagerReationService.insert(record);
    }

    public int insertSelective(SalesmanManagerReationDo record) {
        return salesmanManagerReationService.insertSelective(record);
    }

    public SalesmanManagerReationDo selectByPrimaryKey(Integer id) {
        return salesmanManagerReationService.selectByPrimaryKey(id);
    }

    public SalesmanManagerReationDo selectBySalesmanId(Integer id) {
        return salesmanManagerReationService.selectBySalesmanId(id);
    }

    public int updateByPrimaryKeySelective(SalesmanManagerReationDo record) {
        return salesmanManagerReationService.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SalesmanManagerReationDo record) {
        return salesmanManagerReationService.updateByPrimaryKey(record);
    }
}
