package com.xiyou3g.demo02;

public class Client {
    public static void main(String[] args) {
        dao dao=new dao();
        ProxyInvocationHandler pih =new ProxyInvocationHandler();
        pih.setTarget(dao);
        daoMapper proxy = (daoMapper) pih.getProxy();
        proxy.update();
    }


}
