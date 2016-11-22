/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.service.facade.result;

import com.simon.fincrmprod.service.facade.model.CustomerTraceLogModel;
import com.simon.fincrmprod.service.facade.model.PageInfo;

import java.io.Serializable;
import java.util.List;

/**
 * @author jinshihao
 * @version $Id: CustomerTraceLogQueryResult.java, v 0.1 2016-11-22 20:08 jinshihao Exp $$
 */
public class CustomerTraceLogQueryResult implements Serializable {
    private static final long serialVersionUID = -826363978656009513L;
    private List<CustomerTraceLogModel> customerTraceLogModelList;
    private PageInfo pageInfo;

    /**
     * Getter method for property <tt>customerTraceLogModelList</tt>.
     *
     * @return property value of customerTraceLogModelList
     */
    public List<CustomerTraceLogModel> getCustomerTraceLogModelList() {
        return customerTraceLogModelList;
    }

    /**
     * Setter method for property <tt>customerTraceLogModelList</tt>.
     *
     * @param customerTraceLogModelList value to be assigned to property customerTraceLogModelList
     */
    public void setCustomerTraceLogModelList(List<CustomerTraceLogModel> customerTraceLogModelList) {
        this.customerTraceLogModelList = customerTraceLogModelList;
    }

    /**
     * Getter method for property <tt>pageInfo</tt>.
     *
     * @return property value of pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    /**
     * Setter method for property <tt>pageInfo</tt>.
     *
     * @param pageInfo value to be assigned to property pageInfo
     */
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
}
