package test.com.sajor.study.c01;

import com.sajor.study.c01.School;
import com.sajor.study.c01.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class SchoolTest {
    public static void main(String[] args) {
        //1、实例化 spring 容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");

        //获得 school 对象
        School sc = (School) ac.getBean("school");

        //3、调用 school 对象的 getStudents 方法
        ArrayList<Student> sl = (ArrayList<Student>) sc.getStudents();

        //4、获得 school 里面的 student 对象
        for (Student s : sl) {
            System.out.println(s.toString());
        }
    }
}
