package com.simon.fincrmprod.biz.shared.service.impl;


import com.simon.fincrmprod.biz.shared.service.SalesmanCustomerRelationService;
import com.simon.fincrmprod.common.dal.dao.SalesmanCustomerRelationDao;
import com.simon.fincrmprod.common.dal.model.SalesmanCustomerCountDo;
import com.simon.fincrmprod.common.dal.model.SalesmanCustomerRelationDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jinshihao on 16/8/30.
 */
@Service
public class SalesmanCustomerRelationServiceImpl implements SalesmanCustomerRelationService {
    @Autowired
    private SalesmanCustomerRelationDao salesmanCustomerReationDao;

    public int deleteByPrimaryKey(Integer id) {
        return salesmanCustomerReationDao.deleteByPrimaryKey(id);
    }

    public int insert(SalesmanCustomerRelationDo record) {
        return salesmanCustomerReationDao.insert(record);
    }

    public int insertSelective(SalesmanCustomerRelationDo record) {
        return salesmanCustomerReationDao.insertSelective(record);
    }

    public SalesmanCustomerRelationDo selectByCustomerId(Integer customerId) {
        return salesmanCustomerReationDao.selectByCustomerId(customerId);
    }

    public int updateByPrimaryKeySelective(SalesmanCustomerRelationDo record) {
        return salesmanCustomerReationDao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SalesmanCustomerRelationDo record) {
        return salesmanCustomerReationDao.updateByPrimaryKey(record);
    }

    public List<SalesmanCustomerCountDo> selectCustomerCountBySalesmanIds(String ids) {
        if(ids == null || ids.equals("")){
            return  null;
        }

        String[] idArray = ids.split(",");
        return salesmanCustomerReationDao.selectCustomerCountBySalesmanIds(idArray);
    }
}
