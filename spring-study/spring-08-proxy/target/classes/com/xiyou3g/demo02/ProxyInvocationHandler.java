package com.xiyou3g.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
//被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

//生成得到代理类
    public Object getProxy()
    {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }


//处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        print(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }

    public void print(String string)
    {
        System.out.println("执行"+string+"方法：");
    }

}
