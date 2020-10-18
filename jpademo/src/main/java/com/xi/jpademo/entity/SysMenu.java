package com.xi.jpademo.entity;

import javax.persistence.*;
import java.io.Serializable;

public class SysMenu implements Serializable {
    @Id
    @GeneratedValue
    private int menuId;
    private int sortNO;
    @Column(nullable = false,unique =true)
    private String menuName;

    public int getSortNO() {
        return sortNO;
    }

    public void setSortNO(int sortNO) {
        this.sortNO = sortNO;
    }
    public int getMenuId() {
        return menuId;
    }
    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
}
