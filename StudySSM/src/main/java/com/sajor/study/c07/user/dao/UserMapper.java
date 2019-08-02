package com.sajor.study.c07.user.dao;

import com.sajor.study.c07.user.model.User;

import java.util.List;

public interface UserMapper {
    // 通过id查询
    public User findUserById(int id);

    // 添加
    public void addUser(User user);

    // 查询所有
    public List<User> findAllUsers();
}
