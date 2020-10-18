package com.xi.authorization.model;

import java.util.List;

public class SysMenu {

    private int menu_id;
    private String url;
    private int parent_id;
    private int sortNO;
    private String menu_name;
    private List<SysPopedom> popedoms;

    public List<SysPopedom> getPopedoms() {
        return popedoms;
    }

    public void setPopedoms(List<SysPopedom> popedoms) {
        this.popedoms = popedoms;
    }

    public int getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(int menu_id) {
        this.menu_id = menu_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public int getSortNO() {
        return sortNO;
    }

    public void setSortNO(int sortNO) {
        this.sortNO = sortNO;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }
}
