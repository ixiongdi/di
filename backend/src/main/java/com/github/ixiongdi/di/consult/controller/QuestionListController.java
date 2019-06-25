package com.github.ixiongdi.di.consult.controller;


import com.baomidou.mybatisplus.extension.service.IService;
import com.github.ixiongdi.di.consult.entity.Question;
import com.github.ixiongdi.di.consult.entity.QuestionList;
import com.github.ixiongdi.di.consult.service.IQuestionListService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.github.ixiongdi.di.common.BaseController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiongdi (kotlin@qq.com)
 * @since 2019-06-25
 */
@RestController
@RequestMapping("/consult/question-list")
public class QuestionListController extends BaseController<QuestionList, IQuestionListService> {

}

