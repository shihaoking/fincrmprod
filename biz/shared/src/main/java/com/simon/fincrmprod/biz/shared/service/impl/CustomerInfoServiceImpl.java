package com.simon.fincrmprod.biz.shared.service.impl;


import com.simon.fincrmprod.biz.shared.service.CustomerInfoService;
import com.simon.fincrmprod.common.dal.dao.CustomerInfoDao;
import com.simon.fincrmprod.common.dal.dao.SalesmanCustomerRelationDao;
import com.simon.fincrmprod.common.dal.model.CustomerInfoDo;
import com.simon.fincrmprod.common.dal.model.SearchWithIdAndNameDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jinshihao on 16/8/24.
 */
@Service
public class CustomerInfoServiceImpl implements CustomerInfoService {

    @Autowired
    private CustomerInfoDao customerInfoDao;

    @Autowired
    private SalesmanCustomerRelationDao salesmanCustomerRelationDao;

    public int deleteByPrimaryKey(Integer id) {
        return customerInfoDao.deleteByPrimaryKey(id);
    }

    public int insert(CustomerInfoDo record) {
        return customerInfoDao.insert(record);
    }

    public int insertSelective(CustomerInfoDo record) {
        return customerInfoDao.insertSelective(record);
    }

    public CustomerInfoDo selectByPrimaryKey(Integer id) {
        return customerInfoDao.selectByPrimaryKey(id);
    }

    public List<CustomerInfoDo> getBySalesmanId(Integer customerId) {
        return customerInfoDao.getBySalesmanId(customerId);
    }

    public List<CustomerInfoDo> getBySalesmanIdAndCustomerName(SearchWithIdAndNameDo request) {
        return customerInfoDao.getBySalesmanIdAndCustomerName(request);
    }

    public List<CustomerInfoDo> getByManagerIdAndCustomerName(SearchWithIdAndNameDo request) {
        return customerInfoDao.getByManagerIdAndCustomerName(request);
    }

    public List<CustomerInfoDo> getByManagerId(Integer id) {
        return customerInfoDao.getByManagerId(id);
    }

    public List<CustomerInfoDo> selectAll(Boolean status){
        return  customerInfoDao.selectAll(status);
    }

    public int updateByPrimaryKeySelective(CustomerInfoDo record) {
        return customerInfoDao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(CustomerInfoDo record) {
        return customerInfoDao.updateByPrimaryKey(record);
    }
}
