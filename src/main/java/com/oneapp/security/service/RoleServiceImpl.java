package com.oneapp.security.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oneapp.security.mapper.RoleMapper;
import com.oneapp.security.model.Role;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
        implements RoleService {
}
