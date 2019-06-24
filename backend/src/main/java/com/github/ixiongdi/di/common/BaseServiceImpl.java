package com.github.ixiongdi.di.common;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xiongdi (kotlin@qq.com)
 * @since 2019/6/24 17:12
 */
public class BaseServiceImpl<B, DAO> implements BaseService<B> {

    @Resource
    DAO dao;

    @Override
    public B get() {
        return null;
    }

    @Override
    public Iterable<B> list() {
        return null;
    }

    @Override
    public Long count() {
        return null;
    }

    @Override
    public Boolean save() {
        return null;
    }

    @Override
    public Boolean insert() {
        return null;
    }

    @Override
    public Boolean remove() {
        return null;
    }

    @Override
    public Boolean delete() {
        return null;
    }

    @Override
    public Boolean update() {
        return null;
    }
}
