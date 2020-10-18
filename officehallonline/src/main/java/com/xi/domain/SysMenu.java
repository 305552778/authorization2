package com.xi.domain;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
public class SysMenu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int menuId;
    @Column(nullable = true)
    private String url;
    private int parentId;
    @OneToMany(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY,mappedBy = "menu")
    private List<SysPopedom> popedoms;
    private int sortNO;
    @Column(nullable = false,unique =true)
    private String menuName;

    public List<SysPopedom> getPopedoms() {
        return popedoms;
    }

    public void setPopedoms(List<SysPopedom> popedoms) {
        this.popedoms = popedoms;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }



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
