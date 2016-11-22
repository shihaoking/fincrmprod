/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.service.facade.model;

import java.io.Serializable;

/**
 * @author jinshihao
 * @version $Id: PageInfo.java, v 0.1 2016-11-22 19:40 jinshihao Exp $$
 */
public class PageInfo implements Serializable{
    private static final long serialVersionUID = 5689016743507243082L;

    private int     pageNum;
    private int     pageSize;
    private int     startRow;
    private int     endRow;
    private long    total;
    private int     pages;
    private String  orderRule;

    /**
     * Getter method for property <tt>pageNum</tt>.
     *
     * @return property value of pageNum
     */
    public int getPageNum() {
        return pageNum;
    }

    /**
     * Setter method for property <tt>pageNum</tt>.
     *
     * @param pageNum value to be assigned to property pageNum
     */
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * Getter method for property <tt>pageSize</tt>.
     *
     * @return property value of pageSize
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Setter method for property <tt>pageSize</tt>.
     *
     * @param pageSize value to be assigned to property pageSize
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Getter method for property <tt>startRow</tt>.
     *
     * @return property value of startRow
     */
    public int getStartRow() {
        return startRow;
    }

    /**
     * Setter method for property <tt>startRow</tt>.
     *
     * @param startRow value to be assigned to property startRow
     */
    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    /**
     * Getter method for property <tt>endRow</tt>.
     *
     * @return property value of endRow
     */
    public int getEndRow() {
        return endRow;
    }

    /**
     * Setter method for property <tt>endRow</tt>.
     *
     * @param endRow value to be assigned to property endRow
     */
    public void setEndRow(int endRow) {
        this.endRow = endRow;
    }

    /**
     * Getter method for property <tt>total</tt>.
     *
     * @return property value of total
     */
    public long getTotal() {
        return total;
    }

    /**
     * Setter method for property <tt>total</tt>.
     *
     * @param total value to be assigned to property total
     */
    public void setTotal(long total) {
        this.total = total;
    }

    /**
     * Getter method for property <tt>pages</tt>.
     *
     * @return property value of pages
     */
    public int getPages() {
        return pages;
    }

    /**
     * Setter method for property <tt>pages</tt>.
     *
     * @param pages value to be assigned to property pages
     */
    public void setPages(int pages) {
        this.pages = pages;
    }

    /**
     * Getter method for property <tt>orderRule</tt>.
     *
     * @return property value of orderRule
     */
    public String getOrderRule() {
        return orderRule;
    }

    /**
     * Setter method for property <tt>orderRule</tt>.
     *
     * @param orderRule value to be assigned to property orderRule
     */
    public void setOrderRule(String orderRule) {
        this.orderRule = orderRule;
    }
}
