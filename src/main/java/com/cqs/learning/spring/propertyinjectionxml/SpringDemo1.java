package com.cqs.learning.spring.propertyinjectionxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by li on 18-9-28.
 */
public class SpringDemo1 {
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
       // ApplicationContext.getBean()
    }


}
