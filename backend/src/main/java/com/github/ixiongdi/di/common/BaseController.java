package com.github.ixiongdi.di.common;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BaseController<E, S extends IService<E>> {

    @Resource
    public S service;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<E> index() {
        return service.list();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public E read(@PathVariable("id") Long id) {
        return service.getById(id);
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public void create(E entity) {
        service.save(entity);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable("id") Long id, E entity) {
        service.updateById(entity);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
        service.removeById(id);
    }
}
