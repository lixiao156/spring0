package com.cqs.learning.spring.propertyinjectionxml.note;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by li on 18-9-28.
 */
/*
生命周期的注解(了解)
@PostConstruct
@PreDestroy
 */
//将方法交给Spring管理只要加注解就行了
@Service("customerService")//<bean id = "" init-method = "init" destroy method = "destroy>
//@Scope//默认的是单例
@Scope("prototype") //多例的地址不一样
public class CustomerService {
    @PostConstruct
    public void init(){
        System.out.println("CustomerService被初始化了");
    }

    public void save(){
        System.out.println("Service的save方法");
    }
    @PreDestroy
    public void destory(){
        System.out.println("CustomerService被销毁了");
    }
}
