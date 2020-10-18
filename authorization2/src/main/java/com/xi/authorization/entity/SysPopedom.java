package com.xi.authorization.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
public class SysPopedom implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "popdeom_id", type = IdType.AUTO)
    private Integer popdeomId;

    private String createBy;

    private LocalDateTime createTime;

    private String desciption;

    private String popedom;

    private Integer menuId;


}
