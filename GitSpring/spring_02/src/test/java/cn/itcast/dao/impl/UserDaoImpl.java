package cn.itcast.dao.impl;


import cn.itcast.dao.UserDao;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDaoImpl implements UserDao {
    public void svae() {
        System.out.println("dao....");
    }
}
