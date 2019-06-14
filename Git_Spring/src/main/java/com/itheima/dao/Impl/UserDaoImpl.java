package com.itheima.dao.Impl;

import com.itheima.dao.UserDao;

public class UserDaoImpl implements UserDao {
//    private String company;
//    private int age;
//    public void setCompany(String company) {
//        this.company = company;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }

//    public void save() {
//        System.out.println("对象呗创建");
////        System.out.println(company+"==="+age);
////        System.out.println("UserDao save method running....");
//    }

    public UserDaoImpl() {

        System.out.println("对象被创建");
    }


    public void init(){
        System.out.println("初始化方法....");
    }
    public void destory(){        System.out.println("销毁方法.....");
    }

    public void save() {


    }
}
