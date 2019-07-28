package test.com.sajor.study.c03;

import com.sajor.study.c03.UserXML;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspecJXMLTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config-c03-aop.xml");
        UserXML user = (UserXML) ctx.getBean("userxml");
        user.queryUser();
    }
}
