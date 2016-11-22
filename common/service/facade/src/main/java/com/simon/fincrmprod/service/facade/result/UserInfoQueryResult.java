/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.service.facade.result;

import com.simon.fincrmprod.service.facade.model.PageInfo;
import com.simon.fincrmprod.service.facade.model.UserInfoModel;

import java.io.Serializable;
import java.util.List;

/**
 * @author jinshihao
 * @version $Id: UserInfoQueryResult.java, v 0.1 2016-11-22 20:14 jinshihao Exp $$
 */
public class UserInfoQueryResult implements Serializable {
    private static final long serialVersionUID = 916284728372273191L;

    private List<UserInfoModel> userInfoModelList;

    private PageInfo pageInfo;

    /**
     * Getter method for property <tt>userInfoModelList</tt>.
     *
     * @return property value of userInfoModelList
     */
    public List<UserInfoModel> getUserInfoModelList() {
        return userInfoModelList;
    }

    /**
     * Setter method for property <tt>userInfoModelList</tt>.
     *
     * @param userInfoModelList value to be assigned to property userInfoModelList
     */
    public void setUserInfoModelList(List<UserInfoModel> userInfoModelList) {
        this.userInfoModelList = userInfoModelList;
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
