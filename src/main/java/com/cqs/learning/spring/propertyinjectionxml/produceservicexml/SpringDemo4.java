package com.cqs.learning.spring.propertyinjectionxml.produceservicexml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by li on 18-9-28.
 */
public class SpringDemo4 {
    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProduceService  produceService = (ProduceService) applicationContext.getBean("produceService");
        produceService.save();

    }

}
