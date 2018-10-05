package com.unicorn.transfer.web;

import com.unicorn.transfer.domain.UserInfo;
import com.unicorn.transfer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public UserInfo loginByOpenId(String openid){
        return userService.getUserInfo(openid);
    }
}
