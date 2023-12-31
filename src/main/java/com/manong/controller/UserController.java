package com.manong.controller;


import com.manong.service.UserService;
import com.manong.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lemon
 * @since 2023-11-26
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Resource
    private UserService userService;

    /*
    * 查询所有用户的信息（测试使用）
    * @return
    * */
    @GetMapping("/listAll")
    public Result listAll(){
        return Result.ok(userService.list());
    }

}

