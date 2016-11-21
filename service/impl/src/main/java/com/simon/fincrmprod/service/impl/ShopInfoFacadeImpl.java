/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.service.impl;

import com.simon.fincrmprod.service.facade.ShopInfoFacade;

import javax.jws.WebService;

/**
 * @author jinshihao
 * @version $Id: ShopInfoFacadeImpl.java, v 0.1 2016-11-18 16:30 jinshihao Exp $$
 */
@WebService(endpointInterface = "com.simon.fincrmprod.service.facade.ShopInfoFacade")
public class ShopInfoFacadeImpl implements ShopInfoFacade {
    public String getShopName(String id) {
        return String.format("the book id is %s, book name is %s", id, "Code Is Coll");
    }
}
