package com.simon.fincrmprod.service.facade.model;

import java.io.Serializable;

/**
 * Created by jinshihao on 16/8/25.
 */
public class SalesmanCustomerCountModel implements Serializable {
    private static final long serialVersionUID = -2825733980840681423L;
    private int salesmanId;
    private int customerCount;

    public int getSalesmanId() {
        return salesmanId;
    }

    public void setSalemanId(int salesmanId) {
        this.salesmanId = salesmanId;
    }

    public int getCustomerCount() {
        return customerCount;
    }

    public void setCustomerCount(int customerCount) {
        this.customerCount = customerCount;
    }
}
