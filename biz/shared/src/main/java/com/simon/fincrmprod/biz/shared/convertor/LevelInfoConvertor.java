/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.simon.fincrmprod.biz.shared.convertor;

import com.simon.fincrmprod.common.dal.model.LevelInfoDo;
import com.simon.fincrmprod.service.facade.model.LevelInfoModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinshihao
 * @version $Id: LevelInfoConvertor.java, v 0.1 2016-11-22 15:50 jinshihao Exp $$
 */
public class LevelInfoConvertor {
    public static LevelInfoModel convert(LevelInfoDo levelInfoDo)
    {
        if (levelInfoDo == null){
            return null;
        }

        LevelInfoModel result = new LevelInfoModel();
        result.setId(levelInfoDo.getId());
        result.setLevelName(levelInfoDo.getLevelName());

        return result;
    }

    public static LevelInfoDo convert(LevelInfoModel levelInfoModel)
    {
        if (levelInfoModel == null){
            return null;
        }

        LevelInfoDo result = new LevelInfoDo();
        result.setId(levelInfoModel.getId());
        result.setLevelName(levelInfoModel.getLevelName());

        return result;
    }

    public static List<LevelInfoModel> convert(List<LevelInfoDo> request){
        if(request == null){
            return null;
        }

        List<LevelInfoModel> result = new ArrayList<LevelInfoModel>();
        for (LevelInfoDo item: request) {
            result.add(convert(item));
        }

        return result;
    }
}
