package com.simon.fincrmprod.service.facade.api;


import com.simon.fincrmprod.service.facade.model.CustomerTraceLogModel;
import com.simon.fincrmprod.service.facade.request.CommonInfoQueryRequest;
import com.simon.fincrmprod.service.facade.result.CustomerTraceLogQueryResult;

import javax.jws.WebService;

/**
 * Created by jinshihao on 16/8/24.
 */
@WebService
public interface CustomerTraceLogFacade {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerTraceLogModel record);

    int insertSelective(CustomerTraceLogModel record);

    CustomerTraceLogModel selectByPrimaryKey(Integer id);

    CustomerTraceLogQueryResult selectByCustomerId(CommonInfoQueryRequest request);

    CustomerTraceLogQueryResult selectBySalesmanId(CommonInfoQueryRequest request);

    CustomerTraceLogQueryResult selectByManagerId(CommonInfoQueryRequest request);

    int updateByPrimaryKeySelective(CustomerTraceLogModel record);

    int updateByPrimaryKey(CustomerTraceLogModel record);
}
