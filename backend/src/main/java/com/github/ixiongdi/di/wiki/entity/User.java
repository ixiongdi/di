package com.github.ixiongdi.di.wiki.entity;

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
 * @since 2019-06-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class User extends BaseEntity {

private static final long serialVersionUID=1L;

    private String avatarUrl;

    private String city;

    private String country;

    private LocalDateTime createdDate;

    private String gender;

    private String language;

    private String mail;

    private String mobile;

    private String nickName;

    private String openId;

    private String password;

    private String province;

    private String unionId;

    private LocalDateTime updatedDate;

    private String username;

    private String hospital;

    private String realName;

    private String region0;

    private String region1;

    private String region2;

    private String title;

    private Integer enterpriseId;


}
