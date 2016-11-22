package com.simon.fincrmprod.biz.service.impl;

import com.simon.fincrmprod.biz.shared.service.CustomerInfoService;
import com.simon.fincrmprod.biz.shared.service.SalesmanCustomerRelationService;
import com.simon.fincrmprod.common.dal.model.CustomerInfoDo;
import com.simon.fincrmprod.common.dal.model.SearchWithIdAndNameRequest;
import com.simon.fincrmprod.service.facade.api.CustomerInfoFacade;
import com.simon.fincrmprod.service.facade.result.CustomerInfoWithSalesmanResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by jinshihao on 16/8/24.
 */
@WebService(endpointInterface = "com.simon.fincrmprod.service.facade.api.CustomerInfoFacade")
@Service
public class CustomerInfoFacadeImpl implements CustomerInfoFacade {

    @Autowired
    private CustomerInfoService customerInfoService;

    @Autowired
    private SalesmanCustomerRelationService salesmanCustomerRelationService;

    public int deleteByPrimaryKey(Integer id) {
        return customerInfoService.deleteByPrimaryKey(id);
    }

    public int insert(CustomerInfoDo record) {
        return customerInfoService.insert(record);
    }

    public int insertSelective(CustomerInfoDo record) {
        return customerInfoService.insertSelective(record);
    }

    public CustomerInfoDo selectByPrimaryKey(Integer id) {
        return customerInfoService.selectByPrimaryKey(id);
    }

    public List<CustomerInfoDo> getBySalesmanId(Integer customerId) {
        return customerInfoService.getBySalesmanId(customerId);
    }

    public List<CustomerInfoDo> getBySalesmanIdAndCustomerName(SearchWithIdAndNameRequest request) {
        return customerInfoService.getBySalesmanIdAndCustomerName(request);
    }

    public List<CustomerInfoDo> getByManagerIdAndCustomerName(SearchWithIdAndNameRequest request) {
        return customerInfoService.getByManagerIdAndCustomerName(request);
    }

    public List<CustomerInfoDo> getByManagerId(Integer id) {
        return customerInfoService.getByManagerId(id);
    }

    public List<CustomerInfoDo> selectAll(Boolean status) {
        return customerInfoService.selectAll(status);
    }

    public int updateByPrimaryKeySelective(CustomerInfoDo record) {
        return customerInfoService.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(CustomerInfoDo record) {
        return customerInfoService.updateByPrimaryKey(record);
    }

    public CustomerInfoWithSalesmanResult getCustomerInfoWithSalesman(Integer customerId) {
        return customerInfoService.getCustomerInfoWithSalesman(customerId);
    }

}
