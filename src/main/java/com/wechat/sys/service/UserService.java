package com.wechat.sys.service;

import com.wechat.common.BaseService;
import com.wechat.sys.dao.UserDao;
import com.wechat.sys.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户SERVICE层
 *
 * @author lk
 * @createtime 2017-12-29 下午 2:17
 **/
@Service
@Transactional
public class UserService extends BaseService<UserDao,User>{

}
