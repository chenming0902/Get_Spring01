package com.itheima.Test;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserSpringTest {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) app.getBean("userDao");
        // UserDao userDao2 = (UserDao) app.getBean("userDao");

        //userDao1.save();
        System.out.println(userDao1);
        app.close();
    }
    @Test
    public void test2(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.add();
    }
}
