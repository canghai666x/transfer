package com.unicorn.transfer.service;

import com.unicorn.transfer.domain.UserInfo;
import com.unicorn.transfer.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public UserInfo getUserInfo(String openid){
        return userMapper.findByOpenId(openid);
    }
}
