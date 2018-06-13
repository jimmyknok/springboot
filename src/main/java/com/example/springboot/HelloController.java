package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

   @Autowired
   private StudentProperties studentProperties;
   @Autowired
   private EngineerProperties engineerProperties;

    @RequestMapping("/hello")
    public String hello() {
        return "姓名：" + studentProperties.getName() + ",年龄：" + studentProperties.getAge() + ",职业：" + studentProperties.getJob();
    }

    @RequestMapping("/hi")
    public String hi() {
        return "姓名：" + engineerProperties.getName() + ",年龄：" + engineerProperties.getAge() + ",职业：" + engineerProperties.getJob();
    }
}
