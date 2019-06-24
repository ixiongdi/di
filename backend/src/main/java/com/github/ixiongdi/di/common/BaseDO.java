package com.github.ixiongdi.di.common;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @author xiongdi (kotlin@qq.com)
 * @since
 */
@Data
public class BaseDO {

    @TableId
    private Long id;
    @TableField("is_deleted")

    private Date gmtCreate;
    private Date gmtModified;

    private Boolean deleted;
}
