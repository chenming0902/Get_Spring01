package com.itcast.service.impl;

import com.itcast.dao.UserDao;
import com.itcast.service.UserService;

public class UserviceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public void save() {
        userDao.save();
    }
}
