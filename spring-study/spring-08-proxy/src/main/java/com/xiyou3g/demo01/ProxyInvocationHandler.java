package com.xiyou3g.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//使用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

   //生成得到代理类
    public Object getProxy()
    {
        //static Object newProxyInstance(ClassLoader loader, Class[] interfaces,InvocationHandler h)
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }

    //实现InvocationHandler接口的invoke方法
    //该方法用于处理代理实例，并返回结果
    //该方法负责集中处理动态代理类上的所有方法调用。
    //     第一个参数proxy是调用该方法的代理类实例，
    //     第二个参数method是被调用的方法对象
    //     第三个参数args是方法调用参数。
    //     调用处理器根据这三个参数进行预处理或分派到委托类实例上发射执行
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        Object result = method.invoke(rent, args);
        collect_money();
        return result;
    }

    public void seeHouse()
    {
        System.out.println("中介带看房子...");
    }
    public void collect_money()
    {
        System.out.println("中介收取费用...");
    }



}
