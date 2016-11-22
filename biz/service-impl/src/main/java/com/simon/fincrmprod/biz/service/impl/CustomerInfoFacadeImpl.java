package com.simon.fincrmprod.biz.service.impl;

import com.simon.fincrmprod.biz.shared.convertor.CustomerInfoConvertor;
import com.simon.fincrmprod.biz.shared.convertor.PageInfoConvertor;
import com.simon.fincrmprod.biz.shared.convertor.SalesmanCustomerRelationConvertor;
import com.simon.fincrmprod.biz.shared.convertor.SearchWithIdAndNameConvertor;
import com.simon.fincrmprod.biz.shared.service.CustomerInfoService;
import com.simon.fincrmprod.biz.shared.service.SalesmanCustomerRelationService;
import com.simon.fincrmprod.common.util.interceptor.PageInterceptor;
import com.simon.fincrmprod.service.facade.api.CustomerInfoFacade;
import com.simon.fincrmprod.service.facade.model.CustomerInfoModel;
import com.simon.fincrmprod.service.facade.model.PageInfo;
import com.simon.fincrmprod.service.facade.model.SalesmanCustomerRelationModel;
import com.simon.fincrmprod.service.facade.request.CommonInfoQueryRequest;
import com.simon.fincrmprod.service.facade.result.CustomerInfoQueryResult;
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

    public int insert(CustomerInfoModel record) {
        return customerInfoService.insert(CustomerInfoConvertor.convert(record));
    }

    public int insertSelective(CustomerInfoModel record) {
        return customerInfoService.insertSelective(CustomerInfoConvertor.convert(record));
    }

    public CustomerInfoModel selectByPrimaryKey(Integer id) {
        return CustomerInfoConvertor.convert(customerInfoService.selectByPrimaryKey(id));
    }

    public CustomerInfoQueryResult getBySalesmanId(CommonInfoQueryRequest request) {
        CustomerInfoQueryResult result = new CustomerInfoQueryResult();
        if(request.getPageSize() > 0) {
            PageInterceptor.startPage(request.getPageNum(), request.getPageSize());
        }

        List<CustomerInfoModel> customerInfoModels = CustomerInfoConvertor.convert(customerInfoService.getBySalesmanId(request.getId()));
        PageInterceptor.Page page = PageInterceptor.endPage();

        result.setCustomerInfoModelList(customerInfoModels);

        PageInfo pageInfo = PageInfoConvertor.convert(page);

        result.setPageInfo(pageInfo);

        return result;
    }

    public CustomerInfoQueryResult getBySalesmanIdAndCustomerName(CommonInfoQueryRequest request) {
        CustomerInfoQueryResult result = new CustomerInfoQueryResult();
        if(request.getPageSize() > 0) {
            PageInterceptor.startPage(request.getPageNum(), request.getPageSize());
        }

        List<CustomerInfoModel> customerInfoModels = CustomerInfoConvertor.convert(customerInfoService.getBySalesmanIdAndCustomerName(SearchWithIdAndNameConvertor.convert(request)));

        PageInterceptor.Page page = PageInterceptor.endPage();

        result.setCustomerInfoModelList(customerInfoModels);

        PageInfo pageInfo = PageInfoConvertor.convert(page);

        result.setPageInfo(pageInfo);

        return result;
    }

    public CustomerInfoQueryResult getByManagerIdAndCustomerName(CommonInfoQueryRequest request) {
        CustomerInfoQueryResult result = new CustomerInfoQueryResult();
        if(request.getPageSize() > 0) {
            PageInterceptor.startPage(request.getPageNum(), request.getPageSize());
        }

        List<CustomerInfoModel> customerInfoModels = CustomerInfoConvertor.convert(customerInfoService.getByManagerIdAndCustomerName(SearchWithIdAndNameConvertor.convert(request)));
        PageInterceptor.Page page = PageInterceptor.endPage();

        result.setCustomerInfoModelList(customerInfoModels);

        PageInfo pageInfo = PageInfoConvertor.convert(page);

        result.setPageInfo(pageInfo);

        return result;
    }

    public CustomerInfoQueryResult getByManagerId(CommonInfoQueryRequest request) {
        CustomerInfoQueryResult result = new CustomerInfoQueryResult();
        if(request.getPageSize() > 0) {
            PageInterceptor.startPage(request.getPageNum(), request.getPageSize());
        }

        List<CustomerInfoModel> customerInfoModels = CustomerInfoConvertor.convert(customerInfoService.getByManagerId(request.getId()));
        PageInterceptor.Page page = PageInterceptor.endPage();

        result.setCustomerInfoModelList(customerInfoModels);

        PageInfo pageInfo = PageInfoConvertor.convert(page);

        result.setPageInfo(pageInfo);

        return result;
    }

    public CustomerInfoQueryResult selectAll(CommonInfoQueryRequest request) {
        CustomerInfoQueryResult result = new CustomerInfoQueryResult();
        PageInterceptor.startPage(request.getPageNum(), request.getPageSize());

        List<CustomerInfoModel> customerInfoModels = CustomerInfoConvertor.convert(customerInfoService.selectAll(request.getStatus()));

        PageInterceptor.Page page = PageInterceptor.endPage();

        result.setCustomerInfoModelList(customerInfoModels);

        PageInfo pageInfo = PageInfoConvertor.convert(page);

        result.setPageInfo(pageInfo);

        return result;
    }

    public int updateByPrimaryKeySelective(CustomerInfoModel record) {
        return customerInfoService.updateByPrimaryKeySelective(CustomerInfoConvertor.convert(record));
    }

    public int updateByPrimaryKey(CustomerInfoModel record) {
        return customerInfoService.updateByPrimaryKey(CustomerInfoConvertor.convert(record));
    }

    public CustomerInfoWithSalesmanResult getCustomerInfoWithSalesman(Integer customerId) {
        CustomerInfoModel customerInfoModel = CustomerInfoConvertor.convert(customerInfoService.selectByPrimaryKey(customerId));
        SalesmanCustomerRelationModel salesmanCustomerRelationModel = SalesmanCustomerRelationConvertor.convert(salesmanCustomerRelationService.selectByCustomerId(customerId));

        CustomerInfoWithSalesmanResult result = new CustomerInfoWithSalesmanResult();
        result.setCustomerId(customerInfoModel.getId());
        result.setCustomerName(customerInfoModel.getCustomerName());
        result.setPhoneNumber(customerInfoModel.getPhoneNumber());
        result.setEmail(customerInfoModel.getEmail());
        result.setCreator(customerInfoModel.getCreator());
        result.setCreateTime(customerInfoModel.getCreateTime());
        result.setStatus(customerInfoModel.getStatus());

        if(salesmanCustomerRelationModel != null) {
            result.setSalesmanId(salesmanCustomerRelationModel.getSalesmanId());
        }else {
            result.setSalesmanId(-1);
        }

        return result;
    }

}
