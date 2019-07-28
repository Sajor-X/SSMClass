package test.com.sajor.study.c02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBeanAssembleTest {
    public static void main(String[] args) {

        //1、实例化 spring 容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config-c02-xml.xml");

        //2、获得并打印 user 对象
        System.out.println(applicationContext.getBean("user1"));
        System.out.println(applicationContext.getBean("user2"));
    }
}

