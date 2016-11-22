package com.simon.fincrmprod.service.facade.api;


import com.simon.fincrmprod.common.dal.model.CustomerInfoDo;
import com.simon.fincrmprod.common.dal.model.SearchWithIdAndNameRequest;
import com.simon.fincrmprod.service.facade.result.CustomerInfoWithSalesmanResult;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by jinshihao on 16/8/24.
 */
@WebService
public interface CustomerInfoFacade {
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
