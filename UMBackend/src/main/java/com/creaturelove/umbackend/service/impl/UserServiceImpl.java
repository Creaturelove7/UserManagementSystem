package com.creaturelove.umbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.creaturelove.umbackend.model.User;
import com.creaturelove.umbackend.service.UserService;
import com.creaturelove.umbackend.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangrenren
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-12-15 17:58:55
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




