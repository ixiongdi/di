package com.github.ixiongdi.di.common;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;
import lombok.ToString;

/**
 * @author xiongdi (kotlin@qq.com)
 * @since
 */
public interface BaseService<DO> {
    DO get();

    Iterable<DO> list();

    Long count();

    Boolean save();

    Boolean insert();

    Boolean remove();

    Boolean delete();

    Boolean update();
}
