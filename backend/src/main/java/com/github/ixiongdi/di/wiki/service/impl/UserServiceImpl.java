package com.github.ixiongdi.di.wiki.service.impl;

import com.github.ixiongdi.di.wiki.entity.User;
import com.github.ixiongdi.di.wiki.mapper.UserMapper;
import com.github.ixiongdi.di.wiki.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户  服务实现类
 * </p>
 *
 * @author xiongdi (kotlin@qq.com)
 * @since 2019-06-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
