package com.simon.fincrmprod.common.dal.dao;


import com.simon.fincrmprod.common.dal.model.SalesmanManagerRelationDo;

public interface SalesmanManagerReationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SalesmanManagerRelationDo record);

    int insertSelective(SalesmanManagerRelationDo record);

    SalesmanManagerRelationDo selectByPrimaryKey(Integer id);

    SalesmanManagerRelationDo selectBySalesmanId(Integer id);

    int updateByPrimaryKeySelective(SalesmanManagerRelationDo record);

    int updateByPrimaryKey(SalesmanManagerRelationDo record);
}