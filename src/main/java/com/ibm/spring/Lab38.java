package com.ibm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab38 {

    public static void main(String[] args) {


        ApplicationContext ctx = new ClassPathXmlApplicationContext("web.xml");
        TestBean tb =(TestBean)ctx.getBean("test");
        tb.show();
        System.out.println("done");
    }
}
