package com.simon.fincrmprod.service.facade.model;

import java.io.Serializable;

public class SalesmanManagerRelationModel implements Serializable {
    private static final long serialVersionUID = -846886057890352100L;
    private Integer id;

    private Integer salesmanId;

    private Integer managerId;

    private Boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(Integer salesmanId) {
        this.salesmanId = salesmanId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}