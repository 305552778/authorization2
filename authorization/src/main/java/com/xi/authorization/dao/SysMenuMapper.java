package com.xi.authorization.dao;

import com.xi.authorization.model.SysMenu;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface SysMenuMapper {
    List<SysMenu> getAllMenu();
    SysMenu getMenuByMenuName(String name);
    void insertMenu(SysMenu menu);

    /*以下是注解方式*/
    //@Select("select * from sys_menu")
    //List<SysMenu> getAllMenu();
    //@Select("select * from sys_menu where menu_name=#{name}")
    //List<SysMenu> getMenuByMenuName(@Param("name")String name);
    //@Insert("insert into sys_menu(menu_name,sortno,parent_id,url) values(#{menu_name},#{sortno},#{parent_id},#{url})")
    //void insertMenu(@Param("menu_name")String menu_name,@Param("sortno")Integer sortno,@Param("parent_id")Integer parent_id,@Param("url")String url);
}
