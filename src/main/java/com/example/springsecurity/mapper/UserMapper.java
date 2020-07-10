package com.example.springsecurity.mapper;

import com.example.springsecurity.pojo.User;

public interface UserMapper {
    //验证密码并返回用户信息
    public User selectUser(User user);
}
