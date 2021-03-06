package mybatis.dao;

import mybatis.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoImplTest {

    private ApplicationContext applicationContext;

    //在setUp这个方法得到spring容器
    @Before
    public void setUp() {
        applicationContext = new ClassPathXmlApplicationContext("classpath:mybatis/applicationContext.xml");
    }

    @Test
    public void testFindUserById(){
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        //调用userDao的方法
        User user = userDao.findUserById(1);
        System.out.println(user);
    }
}
