package test.com.sajor.study.c07;

import com.sajor.study.c07.user.model.User;
import com.sajor.study.c07.user.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBatisSpringMapperTest {
    public static void main(String[] args) {
        try {
            ApplicationContext ctx =
                    new ClassPathXmlApplicationContext("c07-spring-config-mybatisspring-mapper.xml");
            UserService userService = (UserService) ctx.getBean(UserService.class);
            User user = userService.findUserById(2);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
