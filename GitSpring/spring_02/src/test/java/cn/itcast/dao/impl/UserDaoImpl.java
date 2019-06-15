package cn.itcast.dao.impl;


import cn.itcast.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("userDao")
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public void svae() {
        System.out.println("dao....");
    }
}
