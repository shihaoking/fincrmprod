package com.simon.fincrmprod.biz.service.impl;

import com.simon.fincrmprod.biz.shared.convertor.SalesmanCustomerCountConvertor;
import com.simon.fincrmprod.biz.shared.convertor.SalesmanCustomerRelationConvertor;
import com.simon.fincrmprod.biz.shared.service.SalesmanCustomerRelationService;
import com.simon.fincrmprod.service.facade.api.SalesmanCustomerRelationFacade;
import com.simon.fincrmprod.service.facade.model.SalesmanCustomerCountModel;
import com.simon.fincrmprod.service.facade.model.SalesmanCustomerRelationModel;
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

    public int insert(SalesmanCustomerRelationModel record) {
        return salesmanCustomerRelationService.insert(SalesmanCustomerRelationConvertor.convert(record));
    }

    public int insertSelective(SalesmanCustomerRelationModel record) {
        return salesmanCustomerRelationService.insertSelective(SalesmanCustomerRelationConvertor.convert(record));
    }

    public SalesmanCustomerRelationModel selectByCustomerId(Integer customerId) {
        return SalesmanCustomerRelationConvertor.convert(salesmanCustomerRelationService.selectByCustomerId(customerId));
    }

    public int updateByPrimaryKeySelective(SalesmanCustomerRelationModel record) {
        return salesmanCustomerRelationService.updateByPrimaryKeySelective(SalesmanCustomerRelationConvertor.convert(record));
    }

    public int updateByPrimaryKey(SalesmanCustomerRelationModel record) {
        return salesmanCustomerRelationService.updateByPrimaryKey(SalesmanCustomerRelationConvertor.convert(record));
    }

    public List<SalesmanCustomerCountModel> selectCustomerCountBySalesmanIds(String ids) {
        if(ids == null || ids.equals("")){
            return  null;
        }

        String[] idArray = ids.split(",");
        return SalesmanCustomerCountConvertor.convert(salesmanCustomerRelationService.selectCustomerCountBySalesmanIds(idArray));
    }
}
