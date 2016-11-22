package com.simon.fincrmprod.service.facade.model;

import java.io.Serializable;

public class SalesmanCustomerRelationModel implements Serializable {
    private static final long serialVersionUID = -2893594675509120879L;
    private Integer id;

    private Integer customerId;

    private Integer salesmanId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(Integer salesmanId) {
        this.salesmanId = salesmanId;
    }
}