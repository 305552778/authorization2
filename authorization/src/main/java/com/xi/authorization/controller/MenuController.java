package com.xi.authorization.controller;

import com.xi.authorization.model.SysMenu;
import com.xi.authorization.model.SysPopedom;
import com.xi.authorization.service.SysMenuService;
import com.xi.authorization.service.SysPopedomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private SysMenuService sysMenuService;
    @Autowired
    private SysPopedomService sysPopedomService;

    @RequestMapping("/add")
    public String Add()
    {
        sysMenuService.add();
        return "操作成功了";
    }

    @RequestMapping("/getall")
    public List<SysPopedom> getall()
    {
       //return sysMenuService.getAll();
        return sysPopedomService.GetPop(31);
    }

    @RequestMapping("/getby")
    public SysMenu getByName()
    {
        return sysMenuService.getMenuByName("菜单一");
    }

    @RequestMapping("/hello")
    public String Index()
    {
        return "你好！SpringBoot";
    }


}
