package com.lhc.quartz_demo.service.impl;

import com.lhc.quartz_demo.entity.JobEntity;
import com.lhc.quartz_demo.mapper.JobEntityMapper;
import com.lhc.quartz_demo.service.IJobEntityService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lhc
 * @since 2019-07-20
 */
@Service
public class JobEntityServiceImpl extends ServiceImpl<JobEntityMapper, JobEntity> implements IJobEntityService {

}
