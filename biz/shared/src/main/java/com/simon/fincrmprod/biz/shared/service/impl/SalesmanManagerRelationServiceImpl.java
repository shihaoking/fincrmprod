/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.biz.shared.service.impl;


import com.simon.fincrmprod.biz.shared.service.SalesmanManagerReationService;
import com.simon.fincrmprod.common.dal.dao.SalesmanManagerReationDao;
import com.simon.fincrmprod.common.dal.model.SalesmanManagerReationDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jinshihao
 * @version $Id: SalesmanManagerRelationImplService.java, v 0.1 2016-09-13 16:13 jinshihao Exp $$
 */
@Service
public class SalesmanManagerRelationServiceImpl implements SalesmanManagerReationService {

    @Autowired
    private SalesmanManagerReationDao salesmanManagerReationDao;

    public int deleteByPrimaryKey(Integer id) {
        return salesmanManagerReationDao.deleteByPrimaryKey(id);
    }

    public int insert(SalesmanManagerReationDo record) {
        return salesmanManagerReationDao.insert(record);
    }

    public int insertSelective(SalesmanManagerReationDo record) {
        return salesmanManagerReationDao.insertSelective(record);
    }

    public SalesmanManagerReationDo selectByPrimaryKey(Integer id) {
        return salesmanManagerReationDao.selectByPrimaryKey(id);
    }

    public SalesmanManagerReationDo selectBySalesmanId(Integer id) {
        return salesmanManagerReationDao.selectBySalesmanId(id);
    }

    public int updateByPrimaryKeySelective(SalesmanManagerReationDo record) {
        return salesmanManagerReationDao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SalesmanManagerReationDo record) {
        return salesmanManagerReationDao.updateByPrimaryKey(record);
    }
}
