package com.xi.controller;

import com.xi.domain.SysMenu;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String Index()
    {
        return "你好！SpringBoot";
    }
    @RequestMapping("/menu")
    public SysMenu GetMenu()
    {
        SysMenu m=new SysMenu();
        m.setMenuId(1);
        m.setMenuName("菜单一");
        m.setSortNO(1);
        return m;
    }
}
