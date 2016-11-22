package com.simon.fincrmprod.service.facade.api;

import com.simon.fincrmprod.common.dal.model.SalesmanCustomerCountDo;
import com.simon.fincrmprod.common.dal.model.SalesmanCustomerRelationDo;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by jinshihao on 16/8/30.
 */
@WebService
public interface SalesmanCustomerRelationFacade {
    int deleteByPrimaryKey(Integer id);

    int insert(SalesmanCustomerRelationDo record);

    int insertSelective(SalesmanCustomerRelationDo record);

    SalesmanCustomerRelationDo selectByCustomerId(Integer customerId);

    int updateByPrimaryKeySelective(SalesmanCustomerRelationDo record);

    int updateByPrimaryKey(SalesmanCustomerRelationDo record);

    List<SalesmanCustomerCountDo> selectCustomerCountBySalesmanIds(String ids);
}
