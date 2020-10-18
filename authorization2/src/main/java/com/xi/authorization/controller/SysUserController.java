package com.xi.authorization.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xi.authorization.entity.SysMenu;
import com.xi.authorization.mapper.SysMenuMapper;
import com.xi.authorization.mapper.SysUserMapper;
import com.xi.authorization.vo.VO_SysUserRoleOrganization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Gong Qiang
 * @since 2020-10-18
 */
@RestController
@RequestMapping("/sys-user")
public class SysUserController {
    @Autowired
    SysUserMapper sysUserMapper;
    @RequestMapping("/vo-user")
    public List<VO_SysUserRoleOrganization> getVOUser()
   {
       IPage<VO_SysUserRoleOrganization> p=new Page<VO_SysUserRoleOrganization>();
       p.setCurrent(1);
       p.setSize(1);
       //p.orders().add(new OrderItem("role_id",true));
       return  sysUserMapper.GetPagedVOUser(p);
   }
}
