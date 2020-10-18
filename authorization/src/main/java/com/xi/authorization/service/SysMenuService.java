package com.xi.authorization.service;

import com.xi.authorization.dao.SysMenuMapper;
import com.xi.authorization.model.SysMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class SysMenuService {
    @Autowired
    private SysMenuMapper sysMenuMapper;

    //Transactional默认只捕捉RuntimeException
    @Transactional
    public void add()
    {
        SysMenu m1=new SysMenu();
        m1.setMenu_name("菜单一");
        m1.setParent_id(0);
        m1.setSortNO(0);
        m1.setUrl("/menu/add");
        SysMenu m2=new SysMenu();
        m2.setMenu_name("菜单二");
        m2.setParent_id(0);
        m2.setSortNO(0);
        m2.setUrl("/menu/del");
        SysMenu m3=new SysMenu();
        m3.setMenu_name("菜单三");
        m3.setParent_id(0);
        m3.setSortNO(0);
        m3.setUrl("/menu/update");
        try{
            sysMenuMapper.insertMenu(m1);
            sysMenuMapper.insertMenu(m2);
            sysMenuMapper.insertMenu(m3);
        }
        catch (RuntimeException e)
        {
            throw e;
        }

        //sysMenuMapper.insertMenu("菜单一",1,0,"/menu/add");
        //sysMenuMapper.insertMenu("菜单二",2,0,"/menu/add");
        //sysMenuMapper.insertMenu("菜单三",3,0,"/menu/add");
        //sysMenuMapper.insertMenu("菜单四",4,0,"/menu/add");
    }
    public List<SysMenu> getAll()
    {
        return sysMenuMapper.getAllMenu();
    }
    public SysMenu getMenuByName(String name)
    {
        return sysMenuMapper.getMenuByMenuName(name);
    }
}
