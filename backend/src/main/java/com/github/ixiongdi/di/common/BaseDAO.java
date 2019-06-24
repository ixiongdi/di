package com.github.ixiongdi.di.common;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author xiongdi (kotlin@qq.com)
 * @since 2019/6/24 15:47
 */
@Mapper
public interface BaseDAO<B> {

    /**
     * 获取单个数据
     * @param id
     * @return
     */
    @Select("SELECT * FROM #{table} WHERE id = #{id}")
    B get(Long id);

    /**
     *
     * @return
     */
    @Select("SELECT * FROM #{table}")
    Iterable<B> list();

    /**
     *
     * @return
     */
    @Select("COUNT(*) FROM #{table}")
    Long count();

    /**
     *
     * @return
     */
    @Select("COUNT(*) FROM #{table}")
    Boolean save();

    @Select("INSERT FROM #{table} VALUES()")
    Boolean insert();

    @Select("DELETE INTO #{table} VALUES()")
    Boolean remove();

    @Select("DELETE INTO #{table} VALUES()")
    Boolean delete();

    @Select("UPDATE INTO #{table} VALUES()")
    Boolean update();
}
