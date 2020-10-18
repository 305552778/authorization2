package com.xi.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
public class SysPopedomAndResource implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    @JoinColumn(name="organizationId",nullable = false)
    private SysOrganization organization;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    @JoinColumn(name="popedomId",nullable = false)
    private SysPopedom popedom;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    @JoinColumn(name="userId",nullable = false)
    private SysUser user;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    @JoinColumn(name="resourceId",nullable = false)
    private SysReource resource;
    private short restrictType;
    @Column(nullable = true)
    private String scopeString;
    @Column(nullable = true)
    private String conditionExpression;
    private String createBy;
    private Timestamp createTime;
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Id
    //private int id;
    //private int organizationId;
    //private int popedomId;
    //private int userId;
    //private int resourceId;
    //private short restrictType;
    //@Column(nullable = true)
    //private String scopeString;
    //@Column(nullable = true)
    //private String conditionExpression;
    //private String createBy;
    //private Timestamp createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SysOrganization getOrganization() {
        return organization;
    }

    public void setOrganization(SysOrganization organization) {
        this.organization = organization;
    }

    public SysPopedom getPopedom() {
        return popedom;
    }

    public void setPopedom(SysPopedom popedom) {
        this.popedom = popedom;
    }

    public SysUser getUser() {
        return user;
    }

    public void setUser(SysUser user) {
        this.user = user;
    }

    public SysReource getResource() {
        return resource;
    }

    public void setResource(SysReource resource) {
        this.resource = resource;
    }

    public short getRestrictType() {
        return restrictType;
    }

    public void setRestrictType(short restrictType) {
        this.restrictType = restrictType;
    }

    public String getScopeString() {
        return scopeString;
    }

    public void setScopeString(String scopeString) {
        this.scopeString = scopeString;
    }

    public String getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
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

    public SysPopedomAndResource() {
    }
}
