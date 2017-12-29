package com.wechat.sys.service;

import com.wechat.common.BaseService;
import com.wechat.sys.dao.MenuDao;
import com.wechat.sys.entity.Menu;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 菜单管理
 *
 * @author lk
 * @createtime 2017-12-29 下午 2:22
 **/
@Service
@Transactional
public class MenuService extends BaseService<MenuDao,Menu>{
}
