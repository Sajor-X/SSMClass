package com.sajor.study.c05.dao;

import com.sajor.study.c05.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class UserDAO {
    /**
     * 根据用户编号查询用户信息
     */

    public User findUserById(int id) throws Exception {

        // 1、读取配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 2、根据配置文件构建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 3、通过 SqlSessionFactory 创建 SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 4、SqlSession 执行映射文件中定义的 SQL，并返回映射结果
        User user = sqlSession.selectOne("com.sajor.study.c05.mapper.UserMapper.findUserById", id);

        // 5、关闭 SqlSession
        sqlSession.close();
        return user;
    }

    /**
     * 根据用户名称来模糊查询用户信息列表
     */
    public List<User> findUserByName(String s) throws Exception {

        // 1、读取配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 2、根据配置文件构建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 3、通过 SqlSessionFactory 创建 SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 4、SqlSession 执行映射文件中定义的 SQL，并返回映射结果
        List<User> users = sqlSession.selectList("com.sajor.study.c05.mapper.UserMapper.findUserByName", s);

        // 5、关闭 SqlSession
        sqlSession.close();
        return users;
    }

    /**
     * 添加用户
     */
    public void addUser(User user) throws Exception {
        // 1、读取配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 2、根据配置文件构建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);

        // 3、通过 SqlSessionFactory 创建 SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 4、SqlSession 执行添加操作
        // 4.1 执行 SqlSession 的插入方法，返回的是 SQL 语句影响的行数
        int rows = sqlSession.insert("com.sajor.study.c05.mapper.UserMapper.addUser", user);

        // 4.2 通过返回结果判断插入操作是否执行成功
        if (rows > 0) {
            System.out.println("您成功插入了" + rows + "条数据!");
        } else {
            System.out.println("执行插入操作失败!!!");
        }

        // 4.3 提交事务
        sqlSession.commit();

        // 5、关闭 SqlSession
        sqlSession.close();
    }

    /**
     * 更新用户
     */
    public void updateUser(User user) throws Exception {
        // 1、读取配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 2、根据配置文件构建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 3、通过 SqlSessionFactory 创建 SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(); // 4、SqlSession 执行更新操作

        // 4.1 执行 SqlSession 的更新方法，返回的是 SQL 语句影响的行数
        int rows = sqlSession.update("com.sajor.study.c05.mapper.UserMapper.updateUser", user);

        // 4.2 通过返回结果判断更新操作是否执行成功
        if (rows > 0) {
            System.out.println("您成功修改了" + rows + "条数据!");
        } else {
            System.out.println("执行修改操作失败!!!");
        }

        // 4.3 提交事务
        sqlSession.commit();

        // 5、关闭 SqlSession
        sqlSession.close();
    }

    /**
     * 删除用户
     */
    public void deleteUser(int id) throws Exception {
        // 1、读取配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 2、根据配置文件构建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 3、通过 SqlSessionFactory 创建 SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 4、SqlSession 执行删除操作
        // 4.1 执行 SqlSession 的删除方法，返回的是 SQL 语句影响的行数
        int rows = sqlSession.delete("com.sajor.study.c05.mapper.UserMapper.deleteUser", id);

        // 4.2 通过返回结果判断删除操作是否执行成功
        if (rows > 0) {
            System.out.println("您成功删除了" + rows + "条数据!");
        } else {
            System.out.println("执行删除操作失败!!!");
        }

        // 4.3 提交事务
        sqlSession.commit();

        // 5、关闭 SqlSession
        sqlSession.close();
    }
}
