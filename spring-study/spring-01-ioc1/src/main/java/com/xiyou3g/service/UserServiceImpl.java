package com.xiyou3g.service;

import com.xiyou3g.dao.UserDao;
import com.xiyou3g.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{

    private UserDao userDao;
    //使用set注入 接口 实现
    public void setUserDao(UserDao userDao)
    {
        this.userDao=userDao;
    }
    public void getUser() {
        userDao.getUser();
    }
}
