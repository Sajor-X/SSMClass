package com.sajor.study.c07.user.service;

import com.sajor.study.c07.user.model.User;

public interface UserService {
    // 通过id查询
    public User findUserById(int id); // 添加

    public void addUser(User user);

    public int getUsersCount();
}
