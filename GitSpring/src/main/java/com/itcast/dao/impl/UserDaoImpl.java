package com.itcast.dao.impl;

import com.itcast.dao.UserDao;
import com.itcast.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao{

//    private List<String> list;
//    public void setList(List<String> list) {
//        this.list = list;
//    }
    private  List<User> userList;

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    private Properties prop;

    public void setMapUser(Map<String, User> mapUser) {
        this.mapUser = mapUser;
    }

    private Map<String,User> mapUser;

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void save() {
        System.out.println("save方法执行");
//        System.out.println(list);
        System.out.println(userList);
        System.out.println(mapUser);
        System.out.println(prop);
    }
}
