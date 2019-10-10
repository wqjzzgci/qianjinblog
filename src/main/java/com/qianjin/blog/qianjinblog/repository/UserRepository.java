package com.qianjin.blog.qianjinblog.repository;

import com.qianjin.blog.qianjinblog.domain.User;

import java.util.List;

public interface UserRepository {
    //保存或者更新用户
    User saveOrUpdateUser(User user);
    /*
    删除用户
     */
    void deleteUser(Long id);
    /*
    根据id查询用户
     */
    User getUserById(Long id);
    /*
    获取用户列表
     */
    List<User>listUsers();
}
