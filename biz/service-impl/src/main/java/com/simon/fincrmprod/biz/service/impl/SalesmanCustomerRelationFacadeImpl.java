package com.simon.fincrmprod.biz.service.impl;

import com.simon.fincrmprod.biz.shared.service.SalesmanCustomerRelationService;
import com.simon.fincrmprod.common.dal.model.SalesmanCustomerCountDo;
import com.simon.fincrmprod.common.dal.model.SalesmanCustomerRelationDo;
import com.simon.fincrmprod.service.facade.api.SalesmanCustomerRelationFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by jinshihao on 16/8/30.
 */
@WebService(endpointInterface = "com.simon.fincrmprod.service.facade.api.SalesmanCustomerRelationFacade")
@Service
public class SalesmanCustomerRelationFacadeImpl implements SalesmanCustomerRelationFacade {
    @Autowired
    private SalesmanCustomerRelationService salesmanCustomerRelationService;

    public int deleteByPrimaryKey(Integer id) {
        return salesmanCustomerRelationService.deleteByPrimaryKey(id);
    }

    public int insert(SalesmanCustomerRelationDo record) {
        return salesmanCustomerRelationService.insert(record);
    }

    public int insertSelective(SalesmanCustomerRelationDo record) {
        return salesmanCustomerRelationService.insertSelective(record);
    }

    public SalesmanCustomerRelationDo selectByCustomerId(Integer customerId) {
        return salesmanCustomerRelationService.selectByCustomerId(customerId);
    }

    public int updateByPrimaryKeySelective(SalesmanCustomerRelationDo record) {
        return salesmanCustomerRelationService.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SalesmanCustomerRelationDo record) {
        return salesmanCustomerRelationService.updateByPrimaryKey(record);
    }

    public List<SalesmanCustomerCountDo> selectCustomerCountBySalesmanIds(String ids) {
        return salesmanCustomerRelationService.selectCustomerCountBySalesmanIds(ids);
    }
}
