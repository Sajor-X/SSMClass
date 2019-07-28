package test.com.sajor.study.c05;

import com.sajor.study.c05.dao.UserDAO;
import com.sajor.study.c05.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyBatisTest {
    public static void main(String[] args) {
        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config-mybatis.xml");

            // 按id查找数据
            UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");
            User user = userDAO.findUserById(2);
            System.out.println(user);

            // 按名字查找数据
            List<User> users = userDAO.findUserByName("萧");
            for (User u : users) {
                System.out.println(u);
            }


            // 插入数据
//            UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");
//            User user = (User) ctx.getBean("user");
//            user.setName("萧大侠");
//            user.setSex("11");
//            user.setEmail("xiaodaxia@cn.cn");
//            userDAO.addUser(user);


//            // 修改数据
//            UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");
//            User user = (User) ctx.getBean("user");
//            user.setId(2);
//            user.setName("萧大侠gai");
//            user.setSex("01");
//            user.setEmail("xiaodaxia@cn.cn");
//            userDAO.updateUser(user);

            // 删除数据
//            UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");
//            userDAO.deleteUser(1);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}