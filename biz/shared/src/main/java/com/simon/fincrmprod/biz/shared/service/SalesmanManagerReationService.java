/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.biz.shared.service;


import com.simon.fincrmprod.common.dal.model.SalesmanManagerRelationDo;

/**
 * @author jinshihao
 * @version $Id: SalesmanManagerReationService.java, v 0.1 2016-09-13 16:13 jinshihao Exp $$
 */
public interface SalesmanManagerReationService {
    int deleteByPrimaryKey(Integer id);

    int insert(SalesmanManagerRelationDo record);

    int insertSelective(SalesmanManagerRelationDo record);

    SalesmanManagerRelationDo selectByPrimaryKey(Integer id);

    SalesmanManagerRelationDo selectBySalesmanId(Integer id);

    int updateByPrimaryKeySelective(SalesmanManagerRelationDo record);

    int updateByPrimaryKey(SalesmanManagerRelationDo record);
}
