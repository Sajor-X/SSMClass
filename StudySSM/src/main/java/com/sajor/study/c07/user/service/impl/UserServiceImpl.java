package com.sajor.study.c07.user.service.impl;

import com.sajor.study.c07.user.dao.UserMapper;
import com.sajor.study.c07.user.model.User;
import com.sajor.study.c07.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(int id) {
        return userMapper.findUserById(id);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public int getUsersCount() {
        return userMapper.findAllUsers().size();
    }
}
