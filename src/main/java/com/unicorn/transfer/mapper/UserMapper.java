package com.unicorn.transfer.mapper;

import com.unicorn.transfer.domain.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

     @Select("Select * FROM userinfo WHERE openid = #{openid}")
     UserInfo findByOpenId(@Param("openid") String openid);
}
