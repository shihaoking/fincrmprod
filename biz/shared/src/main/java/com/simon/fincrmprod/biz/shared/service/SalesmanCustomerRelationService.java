package com.simon.fincrmprod.biz.shared.service;


import com.simon.fincrmprod.common.dal.model.SalesmanCustomerCountDo;
import com.simon.fincrmprod.common.dal.model.SalesmanCustomerRelationDo;

import java.util.List;

/**
 * Created by jinshihao on 16/8/30.
 */
public interface SalesmanCustomerRelationService {
    int deleteByPrimaryKey(Integer id);

    int insert(SalesmanCustomerRelationDo record);

    int insertSelective(SalesmanCustomerRelationDo record);

    SalesmanCustomerRelationDo selectByCustomerId(Integer customerId);

    int updateByPrimaryKeySelective(SalesmanCustomerRelationDo record);

    int updateByPrimaryKey(SalesmanCustomerRelationDo record);

    List<SalesmanCustomerCountDo> selectCustomerCountBySalesmanIds(String ids);
}
