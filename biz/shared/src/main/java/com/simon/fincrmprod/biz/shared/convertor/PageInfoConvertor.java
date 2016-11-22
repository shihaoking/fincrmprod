/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.biz.shared.convertor;

import com.simon.fincrmprod.common.util.interceptor.PageInterceptor;
import com.simon.fincrmprod.service.facade.model.PageInfo;

/**
 * @author jinshihao
 * @version $Id: PageInfoConvertor.java, v 0.1 2016-11-22 20:01 jinshihao Exp $$
 */
public class PageInfoConvertor {
    public static PageInfo convert(PageInterceptor.Page request){
        if (request == null){
            return null;
        }

        PageInfo result = new PageInfo();
        result.setPageNum(request.getPageNum());
        result.setEndRow(request.getEndRow());
        result.setOrderRule(request.getOrderRule());
        result.setPages(request.getPages());
        result.setPageSize(request.getPageSize());
        result.setStartRow(request.getStartRow());
        result.setTotal(request.getTotal());

        return result;
    }
}
