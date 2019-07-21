package com.yoyoyo666.test.spring.configclient.service.impl;

import com.yoyoyo666.test.spring.configclient.entity.ScTest;
import com.yoyoyo666.test.spring.configclient.mapper.ScTestDao;
import com.yoyoyo666.test.spring.configclient.service.ScTestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author pym
 * @since 2019-07-21
 */
@Service
public class ScTestServiceImpl extends ServiceImpl<ScTestDao, ScTest> implements ScTestService {

}
