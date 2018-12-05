package com.mx.blog.controller;

import com.mx.blog.service.IUserService;
import com.mx.blog.cosntenum.ResponseEnum;
import com.mx.blog.entity.User;
import com.mx.blog.result.ResultData;
import com.mx.blog.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:上官名鹏
 * @Description:
 * @Date:Create in 2018/11/3 10:27
 * Modified By:
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/user")
    public ResultData<List<User>> getUserInfo(){
        List<User> users = userService.queryAll();
        return ResultUtil.successResult(users,ResponseEnum.SUCCESS);
    }
}
