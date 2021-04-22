package com.oneapp.security.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oneapp.security.model.User;


public interface UserMapper extends BaseMapper<User> {
//    @Select("select * from t_user where id=#{id}")
//    public User getUserById(Integer id);
//
//    @Select("select * from t_user where username=#{username}")
//    public User findUserByUsername(String username);
//
//    @Insert("insert into t_user values(#{user.username}, #{user.password})")
//    public void appendUser(User user);
//
//
//    @Select("select * from t_role where username=#{username}")
//    public Role[] findRoleByUsername(String username);
}
