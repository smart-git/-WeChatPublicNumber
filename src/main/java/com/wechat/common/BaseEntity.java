package com.wechat.common;

import java.io.Serializable;

/**
 * 实体类的基类
 *
 * @author lk
 * @createtime 2017-12-27 下午 3:32
 **/
public class BaseEntity implements Serializable{
    private static final long serialVersionUID = 1L;
    private String id;//id主键
    private String createDate;//创建日期
    private String remarks;//备注

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
