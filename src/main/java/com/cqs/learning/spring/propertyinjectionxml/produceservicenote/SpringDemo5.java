package com.cqs.learning.spring.propertyinjectionxml.produceservicenote;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by li on 18-9-28.
 */
/*
xml与注解结合  用xml管理类用注解完成属性的注入
xml需要标签 注解需要@
 */
public class SpringDemo5 {
    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProduceService1 produceService1 = (ProduceService1) applicationContext.getBean("produceService1");
        produceService1.save();

    }

}
