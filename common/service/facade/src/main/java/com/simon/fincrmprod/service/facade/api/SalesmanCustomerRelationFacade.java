package com.simon.fincrmprod.service.facade.api;

import com.simon.fincrmprod.service.facade.model.SalesmanCustomerCountModel;
import com.simon.fincrmprod.service.facade.model.SalesmanCustomerRelationModel;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by jinshihao on 16/8/30.
 */
@WebService
public interface SalesmanCustomerRelationFacade {
    int deleteByPrimaryKey(Integer id);

    int insert(SalesmanCustomerRelationModel record);

    int insertSelective(SalesmanCustomerRelationModel record);

    SalesmanCustomerRelationModel selectByCustomerId(Integer customerId);

    int updateByPrimaryKeySelective(SalesmanCustomerRelationModel record);

    int updateByPrimaryKey(SalesmanCustomerRelationModel record);

    List<SalesmanCustomerCountModel> selectCustomerCountBySalesmanIds(String ids);
}
