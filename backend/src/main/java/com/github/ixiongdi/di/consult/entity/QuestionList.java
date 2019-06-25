package com.github.ixiongdi.di.consult.entity;

import com.github.ixiongdi.di.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("consult_question_list")
public class QuestionList extends BaseEntity {

private static final long serialVersionUID=1L;

    private Long consultId;

    private Long questionListId;


}
