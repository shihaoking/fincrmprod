package com.simon.fincrmprod.common.dal.dao;



import com.simon.fincrmprod.common.dal.model.CustomerInfoDo;
import com.simon.fincrmprod.common.dal.model.SearchWithIdAndNameRequest;

import java.util.List;

public interface CustomerInfoDao {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerInfoDo record);

    int insertSelective(CustomerInfoDo record);

    CustomerInfoDo selectByPrimaryKey(Integer id);

    List<CustomerInfoDo> getBySalesmanId(Integer id);

    List<CustomerInfoDo> getByManagerId(Integer id);

    List<CustomerInfoDo> selectAll(Boolean status);

    List<CustomerInfoDo> getBySalesmanIdAndCustomerName(SearchWithIdAndNameRequest request);

    List<CustomerInfoDo> getByManagerIdAndCustomerName(SearchWithIdAndNameRequest request);

    int updateByPrimaryKeySelective(CustomerInfoDo record);

    int updateByPrimaryKey(CustomerInfoDo record);

}