package com.itcast.Test;

import com.itcast.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class userTest {
    @Test
    public void test1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDao = (UserDao) app.getBean("userDao");

        userDao.save();

        System.out.println("llll");
    }
}
