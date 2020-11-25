package com.xiyou3g.demo02;

public class dao implements daoMapper{
    @Override
    public void add() {
        System.out.println("添加用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void update() {
        System.out.println("更新用户");
    }

    @Override
    public void retrieve() {
        System.out.println("查询用户");
    }
}
