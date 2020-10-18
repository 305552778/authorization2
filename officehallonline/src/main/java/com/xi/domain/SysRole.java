package com.xi.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class SysRole implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int roleId;
    private String role;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
    @JoinColumn(name="organizationId",nullable = false)
    private SysOrganization organization;


    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
    @JoinTable(name="SysRolesAndUsers",joinColumns = {@JoinColumn(name="role_id")},inverseJoinColumns = {@JoinColumn(name="user_id")})
    private List<SysUser> sysUsers;


    //@OneToMany
    //private List<SysUser> users;
    @Column(nullable = true)
    private String menuTree;
    private String createBy;
    private Timestamp createTime;
}
