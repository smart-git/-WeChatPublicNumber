package com.wechat.sys.entity;

import com.wechat.common.BaseEntity;

/**
 * 菜单表
 *
 * @author lk
 * @createtime 2017-12-29 上午 10:30
 **/
public class Menu extends BaseEntity {
    private String parentId;//父类ID
    private String parentIds;//所有祖先节点ID,逗号隔开
    private String name;//菜单名称
    private int sort;//排序
    private String href;//菜单链接路径
    private String target;//跳转目标
    private String icon;//图表
    private String isShow;//是否显示
    private String permission;//权限
    private String delFlag;//删除标志

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}
