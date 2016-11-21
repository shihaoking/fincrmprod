/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.service.facade;

import javax.jws.WebService;

/**
 * @author jinshihao
 * @version $Id: ShopInfoFacade.java, v 0.1 2016-11-18 16:29 jinshihao Exp $$
 */
@WebService
public interface ShopInfoFacade {
    String getShopName(String id);
}
