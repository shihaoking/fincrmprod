package com.simon.fincrmprod.service.facade.api;


import com.simon.fincrmprod.common.dal.model.CustomerTraceLogDo;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by jinshihao on 16/8/24.
 */
@WebService
public interface CustomerTraceLogFacade {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerTraceLogDo record);

    int insertSelective(CustomerTraceLogDo record);

    CustomerTraceLogDo selectByPrimaryKey(Integer id);

    List<CustomerTraceLogDo> selectByCustomerId(Integer customerId);

    List<CustomerTraceLogDo> selectBySalesmanId(Integer salesmanId);

    List<CustomerTraceLogDo> selectByManagerId(Integer managerId);

    int updateByPrimaryKeySelective(CustomerTraceLogDo record);

    int updateByPrimaryKey(CustomerTraceLogDo record);
}
