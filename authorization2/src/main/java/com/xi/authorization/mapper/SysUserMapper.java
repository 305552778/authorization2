package com.xi.authorization.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xi.authorization.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xi.authorization.vo.VO_SysUserRoleOrganization;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Gong Qiang
 * @since 2020-10-18
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    List<VO_SysUserRoleOrganization> GetPagedVOUser(IPage<VO_SysUserRoleOrganization> p);
}
