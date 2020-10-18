package com.xi.authorization.dao;

import com.xi.authorization.model.SysPopedom;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysPopedomMapper {
    List<SysPopedom> GetAllPopedom();
    int Del(int id);
    List<SysPopedom> GetPopedomByMenuId(int menuId);
}
