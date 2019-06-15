package com.itcast.service.impl;

import com.itcast.dao.UserDao;
import com.itcast.service.UserService;

import java.util.List;

public class UserviceImpl implements UserService{
    private UserDao userDao;
    private int age;
    private String username;



    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public void save() {
        userDao.save();
        System.out.println(age+username);

    }
    
}
