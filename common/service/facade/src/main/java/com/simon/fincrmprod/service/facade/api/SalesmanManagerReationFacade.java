/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.service.facade.api;

import com.simon.fincrmprod.service.facade.model.SalesmanManagerRelationModel;

import javax.jws.WebService;

/**
 * @author jinshihao
 * @version $Id: SalesmanManagerReationFacade.java, v 0.1 2016-09-13 16:13 jinshihao Exp $$
 */
@WebService
public interface SalesmanManagerReationFacade {
    int deleteByPrimaryKey(Integer id);

    int insert(SalesmanManagerRelationModel record);

    int insertSelective(SalesmanManagerRelationModel record);

    SalesmanManagerRelationModel selectByPrimaryKey(Integer id);

    SalesmanManagerRelationModel selectBySalesmanId(Integer id);

    int updateByPrimaryKeySelective(SalesmanManagerRelationModel record);

    int updateByPrimaryKey(SalesmanManagerRelationModel record);
}
