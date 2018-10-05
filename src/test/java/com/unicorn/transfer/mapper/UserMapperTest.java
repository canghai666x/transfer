package com.unicorn.transfer.mapper;

import com.unicorn.transfer.domain.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.unicorn.transfer.mapper.UserMapper;
import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void getUserInfo() {
        String tmp = "123456789zcx";
        UserInfo userInfo = userMapper.findByOpenId(tmp);
        System.out.print(userInfo);
    }

}