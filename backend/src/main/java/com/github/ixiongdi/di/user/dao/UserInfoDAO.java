package com.github.ixiongdi.di.user.dao;

import com.github.ixiongdi.di.common.BaseDAO;
import com.github.ixiongdi.di.common.BaseDO;
import com.github.ixiongdi.di.user.pojo.UserInfoDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author xiongdi (kotlin@qq.com)
 * @since 2019/6/24 15:42
 */
@Mapper
public interface UserInfoDAO extends BaseDAO<UserInfoDO> {
    String table = "user_info";
}
