/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.service.facade.result;

import com.simon.fincrmprod.service.facade.model.CustomerInfoModel;
import com.simon.fincrmprod.service.facade.model.PageInfo;

import java.io.Serializable;
import java.util.List;

/**
 * @author jinshihao
 * @version $Id: CustomerInfoQueryResult.java, v 0.1 2016-11-22 19:37 jinshihao Exp $$
 */
public class CustomerInfoQueryResult implements Serializable {
    private static final long serialVersionUID = 5581713604004954378L;

    private List<CustomerInfoModel> customerInfoModelList;
    private PageInfo pageInfo;

    /**
     * Getter method for property <tt>customerInfoModelList</tt>.
     *
     * @return property value of customerInfoModelList
     */
    public List<CustomerInfoModel> getCustomerInfoModelList() {
        return customerInfoModelList;
    }

    /**
     * Setter method for property <tt>customerInfoModelList</tt>.
     *
     * @param customerInfoModelList value to be assigned to property customerInfoModelList
     */
    public void setCustomerInfoModelList(List<CustomerInfoModel> customerInfoModelList) {
        this.customerInfoModelList = customerInfoModelList;
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
