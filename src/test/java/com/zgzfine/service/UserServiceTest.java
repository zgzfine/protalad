package com.zgzfine.service;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/5/30.
 */
public class UserServiceTest {
    @Test
    public void test1() throws Exception {
        ApplicationContext testContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) testContext.getBean("userServiceImpl");
        userService.test();
    }

}