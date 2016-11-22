/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.service.facade.api;

import com.simon.fincrmprod.common.dal.model.SalesmanManagerReationDo;

import javax.jws.WebService;

/**
 * @author jinshihao
 * @version $Id: SalesmanManagerReationFacade.java, v 0.1 2016-09-13 16:13 jinshihao Exp $$
 */
@WebService
public interface SalesmanManagerReationFacade {
    int deleteByPrimaryKey(Integer id);

    int insert(SalesmanManagerReationDo record);

    int insertSelective(SalesmanManagerReationDo record);

    SalesmanManagerReationDo selectByPrimaryKey(Integer id);

    SalesmanManagerReationDo selectBySalesmanId(Integer id);

    int updateByPrimaryKeySelective(SalesmanManagerReationDo record);

    int updateByPrimaryKey(SalesmanManagerReationDo record);
}
