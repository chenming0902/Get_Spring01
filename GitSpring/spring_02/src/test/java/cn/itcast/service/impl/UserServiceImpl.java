package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;

//@Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService {
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Autowired
    @Qualifier("userDao")
//@Resource(name = "userDao")
    private UserDao userDao;
    public void save() {
        userDao.svae();
    }

}
