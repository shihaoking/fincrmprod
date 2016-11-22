package com.simon.fincrmprod.biz.shared.service;


import com.simon.fincrmprod.common.dal.model.CustomerInfoDo;
import com.simon.fincrmprod.common.dal.model.SearchWithIdAndNameRequest;
import com.simon.fincrmprod.service.facade.result.CustomerInfoWithSalesmanResult;

import java.util.List;

/**
 * Created by jinshihao on 16/8/24.
 */
public interface CustomerInfoService {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerInfoDo record);

    int insertSelective(CustomerInfoDo record);

    CustomerInfoDo selectByPrimaryKey(Integer id);

    List<CustomerInfoDo> getBySalesmanId(Integer customerId);

    List<CustomerInfoDo> getBySalesmanIdAndCustomerName(SearchWithIdAndNameRequest request);

    List<CustomerInfoDo> getByManagerIdAndCustomerName(SearchWithIdAndNameRequest request);


    List<CustomerInfoDo> getByManagerId(Integer id);

    List<CustomerInfoDo> selectAll(Boolean status);

    int updateByPrimaryKeySelective(CustomerInfoDo record);

    int updateByPrimaryKey(CustomerInfoDo record);

    CustomerInfoWithSalesmanResult getCustomerInfoWithSalesman(Integer customerId);
}
