package com.simon.fincrmprod.service.facade.api;


import com.simon.fincrmprod.service.facade.model.CustomerInfoModel;
import com.simon.fincrmprod.service.facade.request.CommonInfoQueryRequest;
import com.simon.fincrmprod.service.facade.result.CustomerInfoQueryResult;
import com.simon.fincrmprod.service.facade.result.CustomerInfoWithSalesmanResult;

import javax.jws.WebService;

/**
 * Created by jinshihao on 16/8/24.
 */
@WebService
public interface CustomerInfoFacade {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerInfoModel record);

    int insertSelective(CustomerInfoModel record);

    CustomerInfoModel selectByPrimaryKey(Integer id);

    CustomerInfoQueryResult getBySalesmanId(CommonInfoQueryRequest request);

    CustomerInfoQueryResult getBySalesmanIdAndCustomerName(CommonInfoQueryRequest request);

    CustomerInfoQueryResult getByManagerIdAndCustomerName(CommonInfoQueryRequest request);


    CustomerInfoQueryResult getByManagerId(CommonInfoQueryRequest request);

    CustomerInfoQueryResult selectAll(CommonInfoQueryRequest request);

    int updateByPrimaryKeySelective(CustomerInfoModel record);

    int updateByPrimaryKey(CustomerInfoModel record);

    CustomerInfoWithSalesmanResult getCustomerInfoWithSalesman(Integer customerId);
}
