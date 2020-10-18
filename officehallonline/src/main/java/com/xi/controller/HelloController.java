package com.xi.controller;

import com.xi.domain.SysMenu;
import com.xi.domain.SysOrganization;
import com.xi.domain.SysPopedom;
import com.xi.repository.BaseRepository;
import com.xi.repository.SysMenuRepository;
import com.xi.repository.SysOrganizationRepository;
import com.xi.repository.SysPopdeomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.jpa.*;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private SysMenuRepository menuRepository;
    @Autowired
    private SysOrganizationRepository orgRepository;
    @Autowired
    private SysPopdeomRepository popRepository;
    @RequestMapping("/addpop")
    public SysPopedom AddPOP()
    {
        SysPopedom p=new SysPopedom();
        p.setPopedom("增加");
        p.setDesciption("测试");
        p.setCreateBy("龚强");
        p.setCreateTime(new Timestamp(new Date().getTime()));
        return p;
    }
    @RequestMapping("/hello")
    public String Index()
    {
        return "你好！SpringBoot";
    }
    @Transactional
    @RequestMapping("/menu")
    public void GetMenu()
    {
        //menuRepository.deleteAll();
        //popRepository.deleteAll();
        SysPopedom p1=new SysPopedom();
        p1.setPopedom("p1");
        p1.setCreateBy("gq");
        p1.setCreateTime(new Timestamp(new Date().getTime()));
        SysPopedom p2=new SysPopedom();
        p2.setPopedom("p2");
        p2.setCreateBy("gq");
        p2.setCreateTime(new Timestamp(new Date().getTime()));
        SysPopedom p3=new SysPopedom();
        p3.setPopedom("p3");
        p3.setCreateBy("gq");
        p3.setCreateTime(new Timestamp(new Date().getTime()));

        SysMenu m1=new SysMenu();
        m1.setMenuId(1);
        m1.setMenuName("菜单一");
        m1.setSortNO(1);
        m1.setUrl("/menu");
        m1.setParentId(0);
        SysMenu m2=new SysMenu();
        m2.setMenuId(1);
        m2.setMenuName("菜单二");
        m2.setSortNO(1);
        m2.setUrl("/menu");
        m2.setParentId(0);
        SysMenu m3=new SysMenu();
        m3.setMenuId(1);
        m3.setMenuName("菜单三");
        m3.setSortNO(1);
        m3.setUrl("/menu");
        m3.setParentId(0);
        //m1.getPopedoms().add(p1);
        //m2.getPopedoms().add(p2);
        //p3.setMenu(m3);
        //m3.setPopedoms(Arrays.asList(p3));
        p3.setMenu(m3);
        List<SysPopedom> ss=new ArrayList<>();
        ss.add(p3);
        m3.setPopedoms(ss);
        menuRepository.save(m3);
        //popRepository.save(p3);
        //menuRepository.save(m1);

        //menuRepository.save(m2);
        //popRepository.save(p3);
    }
    @RequestMapping("/addorg")
    public SysOrganization AddORG()
    {
        SysOrganization org=new SysOrganization();
        org.setOrganizationName("银杏酒店管理学院");
        orgRepository.save(org);
        return org;
    }
}
