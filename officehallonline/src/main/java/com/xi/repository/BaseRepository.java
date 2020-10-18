package com.xi.repository;

import com.sun.xml.bind.v2.model.core.ID;
import com.xi.domain.SysMenu;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class BaseRepository<T> implements JpaRepository<SysMenu, Integer> {
}
