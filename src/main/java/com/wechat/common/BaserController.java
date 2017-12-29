package com.wechat.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

/**
 * 控制层基类
 *
 * @author lk
 * @createtime 2017-12-29 上午 11:12
 **/
@Controller
public class BaserController{
    protected Logger logger= LoggerFactory.getLogger(getClass());
}
