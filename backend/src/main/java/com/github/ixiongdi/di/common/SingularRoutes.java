package com.github.ixiongdi.di.common;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

public class SingularRoutes<E, S extends IService<E>> {


    @Resource
    public S service;

    @RequestMapping
    public E get() {
        return service.getById(1);
    }

    @RequestMapping
    public Boolean create(E e) {
        return service.save(e);
    }

    @RequestMapping
    public void replace(E e) {
        service.updateById(e);
    }

    @RequestMapping
    public void update(E e) {
        service.updateById(e);
    }




}
