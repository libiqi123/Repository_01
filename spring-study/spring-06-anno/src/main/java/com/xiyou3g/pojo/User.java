package com.xiyou3g.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component//等价于 <bean id="user" class="com.xiyou3g.pojo.User"/>  对象名默认为类名小写  Component:组件
public class User {
    @Value("张琪琪")
    public String name="李碧琪";
}
