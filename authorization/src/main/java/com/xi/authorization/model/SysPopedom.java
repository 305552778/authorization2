package com.xi.authorization.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.sql.Timestamp;


public class SysPopedom{

    private int popdeom_id;
    private int menu_id;
    private String popedom;
    private String createBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    private Timestamp createTime;
    private String desciption;
    private SysMenu menu;

    public SysMenu getMenu() {
        return menu;
    }

    public void setMenu(SysMenu menu) {
        this.menu = menu;
    }

    public int getPopdeom_id() {
        return popdeom_id;
    }

    public void setPopdeom_id(int popdeom_id) {
        this.popdeom_id = popdeom_id;
    }

    public int getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(int menu_id) {
        this.menu_id = menu_id;
    }

    public String getPopedom() {
        return popedom;
    }

    public void setPopedom(String popedom) {
        this.popedom = popedom;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }
}
