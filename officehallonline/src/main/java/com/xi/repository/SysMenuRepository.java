package com.xi.repository;

import com.xi.domain.SysMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SysMenuRepository extends JpaRepository<SysMenu, Integer> {
    SysMenu findByMenuName(String name);
    SysMenu findByMenuId(int id);
}
