package test.com.sajor.study.c07;

import com.sajor.study.c07.dao.User;
import com.sajor.study.c07.dao.UserDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBatisSpringDAOTest {
    public static void main(String[] args) {
        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("c07-spring-mybatis-config-dao.xml");
            UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");
            User user = userDAO.findUserById(2);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
