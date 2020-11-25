package com.xiyou3g.demo01;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host=new Host();

        //使用ProxyInvocationHandler类生成代理角色
        ProxyInvocationHandler pih=new ProxyInvocationHandler();
        //为调用处理器设置需要被代理的接口对象
        pih.setRent(host);
        //通过ProxyInvocationHandler对象获得代理类
        Rent proxy =(Rent) pih.getProxy();
        //通过代理类执行方法
        proxy.rent();
    }
}
