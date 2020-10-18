package com.xi.authorization.service;

import com.xi.authorization.dao.SysPopedomMapper;
import com.xi.authorization.model.SysPopedom;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysPopedomService {
    @Autowired
    SysPopedomMapper sysPopedomMapper;
    public List<SysPopedom> GetPop(int id)
    {
        return sysPopedomMapper.GetPopedomByMenuId(id);
    }
}
