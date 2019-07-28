package test.com.sajor.study.c04;

import com.sajor.study.c01.Student;
import com.sajor.study.c04.JdbcTemplateUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JdbcTemplateTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config-c04.xml");
        JdbcTemplateUtil jdbcTemplateUtil = (JdbcTemplateUtil) ctx.getBean("jdbcTemplateUtil");

        //第一次测试时，运行创建库表方法。后面注释掉
        jdbcTemplateUtil.createTable();

        Student student = (Student) ctx.getBean("student");
        student.setName("李四");
        student.setSex("01");
        student.setEmail("lisi@cn.cn");

        jdbcTemplateUtil.addUser(student);

        Student student1 = jdbcTemplateUtil.searchUser(1);
        System.out.println("id=" + student1.getId() + " " + "name=" + student1.getName());

        List<Student> list = jdbcTemplateUtil.findAll();
        System.out.println("所有用户数=" + list.size());

        for (int i = 0; i < list.size(); i++) {
            Student student2 = (Student) list.get(i);
            System.out.println("id=" + student2.getId() + " " + "name=" + student2.getName());
        }
    }
}
