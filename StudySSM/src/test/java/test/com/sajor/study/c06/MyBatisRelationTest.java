package test.com.sajor.study.c06;

import com.sajor.study.c06.dao.JobDAO;
import com.sajor.study.c06.dao.UserDAO;
import com.sajor.study.c06.model.Job;
import com.sajor.study.c06.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBatisRelationTest {
    public static void main(String[] args) {
        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config-mybatis-c06-relation.xml");
            UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");

//            User user = userDAO.findUserById(2);

//            User user = userDAO.findUserWithResumesByID(2);
//            System.out.println(user);

            JobDAO jobDAO = (JobDAO) ctx.getBean("jobDAO");
            Job job = jobDAO.findJobsWithResumeByID(2);
            System.out.println(job);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
