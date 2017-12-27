package com.wechat.common;

import java.util.List;

/**
 * Created by lk on 2017/12/27 0027.
 */
public interface BaseDao<T> {
    T get(T t);
    List<T> findAll();
    void insert(T t);
    void update(T t);
    void delete(T t);
}
