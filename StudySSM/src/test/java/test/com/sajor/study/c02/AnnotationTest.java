package test.com.sajor.study.c02;

import com.sajor.study.c02.annotation.ClazzAnnotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring-config-c02-annotation.xml"});
        ClazzAnnotation c = (ClazzAnnotation) ac.getBean("clazzAnnotation");
        System.out.println(c.toString());
    }
}
