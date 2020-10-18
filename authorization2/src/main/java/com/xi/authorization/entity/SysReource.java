package com.xi.authorization.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class SysReource implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer reourceId;

    private String reourceName;

    private String resourceType;

    private Integer organizationId;


}
