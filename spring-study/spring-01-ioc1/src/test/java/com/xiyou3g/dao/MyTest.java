package com.xiyou3g.dao;

import com.xiyou3g.dao.UserDaoImpl;
import com.xiyou3g.service.UserService;
import com.xiyou3g.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {

/*
        //用户实际调用的是业务层m，dao层他们不需要接触！
        UserServiceImpl userService=new UserServiceImpl();
        userService.setUserDao(new UserDaoMysqlImpl());
        userService.getUser();

*/

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl)context.getBean("UserServiceImpl");
        userServiceImpl.getUser();

    }
    


    
}
