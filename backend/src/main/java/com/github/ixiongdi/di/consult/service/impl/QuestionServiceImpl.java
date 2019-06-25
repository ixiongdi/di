package com.github.ixiongdi.di.consult.service.impl;

import com.github.ixiongdi.di.consult.entity.Question;
import com.github.ixiongdi.di.consult.mapper.QuestionMapper;
import com.github.ixiongdi.di.consult.service.IQuestionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiongdi (kotlin@qq.com)
 * @since 2019-06-25
 */
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements IQuestionService {

}
