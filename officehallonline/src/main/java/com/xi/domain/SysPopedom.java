package com.xi.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
@Entity
public class SysPopedom implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int popdeomId;
    @ManyToOne()
    @JoinColumn(name="menuId",nullable = true,updatable = false)
    private SysMenu menu;
    private String popedom;
    private String createBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    private Timestamp createTime;
    @Column(nullable = true)
    private String desciption;

    public int getPopdeomId() {
        return popdeomId;
    }

    public void setPopdeomId(int popdeomId) {
        this.popdeomId = popdeomId;
    }

    public SysMenu getMenu() {
        return menu;
    }

    public void setMenu(SysMenu menu) {
        this.menu = menu;
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
