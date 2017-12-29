package com.wechat.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * service层基类
 *
 * @author lk
 * @createtime 2017-12-29 上午 11:09
 **/
@Service
@Transactional
public class BaseService<D extends BaseDao<T>,T extends BaseEntity> {
    protected Logger logger= LoggerFactory.getLogger(getClass());
    @Autowired
    private D dao;
}
