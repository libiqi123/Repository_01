package com.xiyou3g.config;

import com.xiyou3g.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration//@Configuration 代表这是一个配置类，与之前beans.xml等价
@ComponentScan("com.xiyou3g.pojo")//扫描指定包下的bean
@Import(BeansConfig2.class)//合并BeansConfig2配置类
public class BeansConfig {

    //注册一个bean就相当于之前写的一个bean标签
    //方法名 == bean id
    //方法返回值 == bean class
    @Bean
    public User User()
    {
        return new User();
    }
}
