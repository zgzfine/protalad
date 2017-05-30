package com.zgzfine.controller;

import com.zgzfine.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by Administrator on 2017/5/28.
 */
@Controller
@RequestMapping("/")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    public UserService userService;

    @RequestMapping(value = "hello" , method = RequestMethod.GET)
    public String hello(Map<String,String> map){
        System.out.print("555");
        logger.info("hello"+this.getClass());
        map.put("hello","good day");
        userService.test();
        return "hello";
    }

}
