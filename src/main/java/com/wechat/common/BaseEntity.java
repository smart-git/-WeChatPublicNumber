package com.wechat.common;

import java.util.Date;

/**
 * 实体类的基类
 *
 * @author lk
 * @createtime 2017-12-27 下午 3:32
 **/
public class BaseEntity {
    private String id;
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
