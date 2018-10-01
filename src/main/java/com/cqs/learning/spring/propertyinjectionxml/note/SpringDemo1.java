package com.cqs.learning.spring.propertyinjectionxml.note;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by li on 18-9-28.
 */
public class SpringDemo1 {
    @Test
    public void demo1(){
        //利用工厂方法来获取
       // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
        System.out.println(customerService);
      //  applicationContext.close();

        ClassPathXmlApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService2 = (CustomerService) applicationContext.getBean("customerService");
        System.out.println(customerService2);
        //要销毁需要关闭工厂
        //需要子类对象 ClassPathXmlApplicationContext 新建对象
        applicationContext2.close();

    }
}
