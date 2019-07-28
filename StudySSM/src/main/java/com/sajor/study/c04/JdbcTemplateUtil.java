package com.sajor.study.c04;

import com.sajor.study.c01.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcTemplateUtil {
    private JdbcTemplate jdbcTemplate;
    private String errorTest;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void createTable() {
        jdbcTemplate.execute("DROP TABLE IF EXISTS user");
        jdbcTemplate.execute("CREATE TABLE user (\n" +
                " id int(11) NOT NULL AUTO_INCREMENT,\n" +
                " name varchar(50) DEFAULT NULL,\n" +
                " sex varchar(2) DEFAULT NULL,\n" +
                " email varchar(125) DEFAULT NULL,\n" +
                " PRIMARY KEY (`id`)\n" +
                ")"
        );
    }

    public void addUser(Student student) {
        String sql = "insert into user (name,sex,email) values(?,?,?)";
        jdbcTemplate.update(sql, student.getName(), student.getSex(), student.getEmail());
    }

    public void deleteUser(int id) {
        String sql = "delete from user where id=?";
        jdbcTemplate.update(sql, id);
    }

    public void updateUser(Student student) {
        String sql = "update user set name=?,sex=?,email=? where id=?";
        jdbcTemplate.update(sql, student.getName(), student.getSex(), student.getEmail(),
                student.getId());
    }

    // 简单查询，按照 ID 查询，返回字符串
    public String searchUserName(int id) {
        String sql = "select name from user where id=?";
        return jdbcTemplate.queryForObject(sql, String.class, id);
    }

    // 复杂查询返回 List 集合
    public List<Student> findAll() {
        String sql = "select * from user";
        return jdbcTemplate.query(sql, new StudentRowMapper());
    }

    //根据 id 查询
    public Student searchUser(int id) {
        String sql = "select * from user where id=?";
        return jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);
    }

    //使用 spring RowMapper 进行数据集和对象映射
    class StudentRowMapper implements RowMapper<Student> {
        //rs 为返回结果集，以每行为单位封装着
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setSex(rs.getString("sex"));
            student.setEmail(rs.getString("email"));
            return student;
        }
    }

}
