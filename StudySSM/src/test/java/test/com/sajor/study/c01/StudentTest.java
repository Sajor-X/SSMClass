package test.com.sajor.study.c01;

import com.sajor.study.c01.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    public static void main(String[] args) {
        // 1、实例化 spring 容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");

        // 2、获得 student 对象
        Student s = (Student) ac.getBean("student");
        s.setId(100);
        s.setName("张三");

        // 3、调用 student 对象的 toString 方法
        System.out.println(s.toString());
    }
}
