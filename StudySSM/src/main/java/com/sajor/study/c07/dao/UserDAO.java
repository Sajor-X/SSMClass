package com.sajor.study.c07.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDAO extends SqlSessionDaoSupport {
    // 通过id查询
    public User findUserById(Integer id) {
        return this.getSqlSession().selectOne( "com.sajor.study.c07.dao.UserMapper.findUserById", id);
    }
}
