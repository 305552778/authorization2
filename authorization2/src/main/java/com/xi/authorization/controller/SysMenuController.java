package com.xi.authorization.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xi.authorization.entity.SysMenu;
import com.xi.authorization.mapper.SysMenuMapper;
import com.xi.authorization.service.ISysMenuService;
import com.xi.authorization.service.SysMenuService;
import com.xi.authorization.service.impl.SysMenuServiceImpl;
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
@RequestMapping("/sys-menu")
public class SysMenuController {
    @Autowired
    ISysMenuService sysMenuService;
    @RequestMapping("/all")
    IPage<SysMenu> all()
    {
        IPage<SysMenu> p=new Page<SysMenu>();
        p.setCurrent(2);
        p.setSize(1);
        p.orders().add(new OrderItem("menu_id",true));
        return  sysMenuService.page(p);
       //return sysMenuService.list();
    }
}
