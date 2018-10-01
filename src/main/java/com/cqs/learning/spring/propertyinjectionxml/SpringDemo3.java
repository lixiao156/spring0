package com.cqs.learning.spring.propertyinjectionxml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by li on 18-9-28.
 */
public class SpringDemo3 {
    @Test
    //传统方式

    public void demo1() {
        UserDo  userDo = new UserDoImpl();//使用一个接口的引用 接收接口实现类创建的对象
       // UserDoImpl userDo = new UserDoImpl();//直接使用接口的实现类的引用;因set和get方法都在实现类中,用接口的引用调用不到
        //userDo.setName("李冰");
        userDo.save();//调用方法
    }

    @Test
    //Spring的IOC方式
    //Ioc的意思是Inversion of Control 控制反转 降低耦合的一种编程方式
    public void demo2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
         UserDo userDo = (UserDo)applicationContext.getBean("userDo");
            userDo.save();

    }
    @Test
    public void demo3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.save();

    }

}
