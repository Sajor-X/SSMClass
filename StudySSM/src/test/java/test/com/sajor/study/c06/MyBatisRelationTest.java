package test.com.sajor.study.c06;

import com.sajor.study.c06.dao.UserDAO;
import com.sajor.study.c06.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBatisRelationTest {
    public static void main(String[] args) {
        try {
            ApplicationContext ctx =
                    new ClassPathXmlApplicationContext("spring-config-mybatis-c06-relation.xml");
            UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");
            User user = userDAO.findUserById(2);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}