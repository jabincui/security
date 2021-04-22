package com.oneapp.security.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oneapp.security.mapper.UserMapper;
import com.oneapp.security.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

}
