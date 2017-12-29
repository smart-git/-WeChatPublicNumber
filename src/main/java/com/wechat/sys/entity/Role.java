package com.wechat.sys.entity;

import com.wechat.common.BaseEntity;

/**
 * 角色表
 *
 * @author lk
 * @createtime 2017-12-29 上午 10:23
 **/
public class Role extends BaseEntity {
    private String name;//角色名字
    private String enname;//英文名字
    private String roleType;//角色类型
    private String delFlag;//删除标志

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}

