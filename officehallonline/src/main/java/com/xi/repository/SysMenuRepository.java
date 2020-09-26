package com.xi.repository;

import com.xi.domain.SysMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SysMenuRepository extends JpaRepository<SysMenu, Integer> {
    SysMenu findByMenuName(String name);
    SysMenu findByMenuId(int id);
}
