package com.github.ixiongdi.di.wiki.controller;


import com.github.ixiongdi.di.wiki.entity.User;
import com.github.ixiongdi.di.wiki.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.github.ixiongdi.di.common.BaseController;

import java.util.List;

/**
 * <p>
 * 用户  前端控制器
 * </p>
 *
 * @author xiongdi (kotlin@qq.com)
 * @since 2019-06-21
 */
@RestController
@RequestMapping("/wiki/user")
public class UserController extends BaseController<User, IUserService> {

    @RequestMapping("/")
    public List<User> index() {
        return service.list();
    }
}

