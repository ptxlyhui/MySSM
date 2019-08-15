package com.lyhui.mapper;

import com.lyhui.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    int delete(String name);

    User query(User user);

    User add(@Param("user") User user, @Param("str") String str);

    User queryById(User user);
}
