package com.xiyou3g.dao;

public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("使用mysql获取数据");
    }
}
