package com.xi.authorization.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Gong Qiang
 * @since 2020-10-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysRolesAndUsers implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer roleId;

    private Integer userId;


}
