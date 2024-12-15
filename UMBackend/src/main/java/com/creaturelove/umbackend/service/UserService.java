package com.creaturelove.umbackend.service;

import com.creaturelove.umbackend.model.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author zhangrenren
* @description 针对表【user】的数据库操作Service
* @createDate 2024-12-15 17:58:55
*/
public interface UserService extends IService<User> {

    boolean userResiter(String userAccount, String pass)
}
