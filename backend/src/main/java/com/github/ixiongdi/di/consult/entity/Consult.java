package com.github.ixiongdi.di.consult.entity;

import com.github.ixiongdi.di.common.BaseEntity;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author xiongdi (kotlin@qq.com)
 * @since 2019-06-25
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Consult extends BaseEntity {

private static final long serialVersionUID=1L;

    private Integer count;

    private LocalDateTime createdDate;

    private String openid;

    private Double price;

    private Integer status;

    private Integer type;

    private LocalDateTime updatedDate;

    private Integer enterpriseId;


}
