/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.service.facade.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jinshihao
 * @version $Id: CustomerInfoModel.java, v 0.1 2016-11-22 15:00 jinshihao Exp $$
 */
public class CustomerInfoModel implements Serializable {
    private static final long serialVersionUID = 1541688383704121794L;
    private Integer id;

    private String customerName;

    private String phoneNumber;

    private String email;

    private Boolean status;

    private Integer creator;

    private Date createTime;

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id value to be assigned to property id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>customerName</tt>.
     *
     * @return property value of customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Setter method for property <tt>customerName</tt>.
     *
     * @param customerName value to be assigned to property customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * Getter method for property <tt>phoneNumber</tt>.
     *
     * @return property value of phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter method for property <tt>phoneNumber</tt>.
     *
     * @param phoneNumber value to be assigned to property phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter method for property <tt>email</tt>.
     *
     * @return property value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for property <tt>email</tt>.
     *
     * @param email value to be assigned to property email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter method for property <tt>status</tt>.
     *
     * @return property value of status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * Setter method for property <tt>status</tt>.
     *
     * @param status value to be assigned to property status
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * Getter method for property <tt>creator</tt>.
     *
     * @return property value of creator
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * Setter method for property <tt>creator</tt>.
     *
     * @param creator value to be assigned to property creator
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * Getter method for property <tt>createTime</tt>.
     *
     * @return property value of createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * Setter method for property <tt>createTime</tt>.
     *
     * @param createTime value to be assigned to property createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
