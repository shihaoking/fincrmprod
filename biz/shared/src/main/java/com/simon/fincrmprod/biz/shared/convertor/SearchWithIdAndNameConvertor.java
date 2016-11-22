/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.biz.shared.convertor;

import com.simon.fincrmprod.common.dal.model.SearchWithIdAndNameDo;
import com.simon.fincrmprod.service.facade.request.CommonInfoQueryRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinshihao
 * @version $Id: SearchWithIdAndNameConvertor.java, v 0.1 2016-11-22 16:00 jinshihao Exp $$
 */
public class SearchWithIdAndNameConvertor {
    public static CommonInfoQueryRequest convert(SearchWithIdAndNameDo idAndNameDo){
        if(idAndNameDo == null){
            return null;
        }

        CommonInfoQueryRequest request = new CommonInfoQueryRequest();
        request.setId(idAndNameDo.getId());
        request.setName(idAndNameDo.getName());

        return request;
    }

    public static SearchWithIdAndNameDo convert(CommonInfoQueryRequest idAndNameRequest){
        if(idAndNameRequest == null){
            return null;
        }

        SearchWithIdAndNameDo request = new SearchWithIdAndNameDo();
        request.setId(idAndNameRequest.getId());
        request.setName(idAndNameRequest.getName());

        return request;
    }

    public static List<CommonInfoQueryRequest> convert(List<SearchWithIdAndNameDo> request){
        if(request == null){
            return null;
        }

        List<CommonInfoQueryRequest> result = new ArrayList<CommonInfoQueryRequest>();
        for (SearchWithIdAndNameDo item: request) {
            result.add(convert(item));
        }

        return result;
    }
}
