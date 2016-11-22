package com.simon.fincrmprod.service.facade.model;

import java.io.Serializable;

public class LevelInfoModel implements Serializable {
    private static final long serialVersionUID = -3023830789427677020L;
    private Integer id;

    private String levelName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }
}