package com.github.ixiongdi.di.consult.controller;


import com.baomidou.mybatisplus.extension.service.IService;
import com.github.ixiongdi.di.consult.entity.AnswerList;
import com.github.ixiongdi.di.consult.service.IAnswerListService;
import com.github.ixiongdi.di.consult.service.IAnswerService;
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
@RequestMapping("/consult/answer-list")
public class AnswerListController extends BaseController<AnswerList, IAnswerListService> {

}

