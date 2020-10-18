package com.xi.authorization.service.impl;

import com.xi.authorization.entity.HibernateSequence;
import com.xi.authorization.mapper.HibernateSequenceMapper;
import com.xi.authorization.service.IHibernateSequenceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Gong Qiang
 * @since 2020-10-18
 */
@Service
public class HibernateSequenceServiceImpl extends ServiceImpl<HibernateSequenceMapper, HibernateSequence> implements IHibernateSequenceService {

}
