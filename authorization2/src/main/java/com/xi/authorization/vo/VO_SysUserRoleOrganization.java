package com.xi.authorization.vo;

import lombok.Data;

@Data
public class VO_SysUserRoleOrganization {
    private Integer id;

    private String idnumber;

    private Boolean gender;

    private String icon;

    private String name;

    private String phone;

    private String pwd;

    private String userName;

    private Integer organizationId;

    private String organizationName;

    private Integer roleId;

    private String role;
}
