package com.mx.blog.service.impl;

import com.mx.blog.service.IUserService;
import com.mx.blog.base.service.BaseService;
import com.mx.blog.entity.User;
import com.mx.blog.mapper.UserMapper;
import com.mx.blog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:上官名鹏
 * @Description:
 * @Date:Create in 2018/11/3 10:26
 * Modified By:
 */
@Service
public class UserServiceImpl extends BaseService<User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

//    @Override
//    public Mapper<User> getMapper() {
//        return userMapper;
//    }
}
