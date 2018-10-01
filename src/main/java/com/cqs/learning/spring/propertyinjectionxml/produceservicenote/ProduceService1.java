package com.cqs.learning.spring.propertyinjectionxml.produceservicenote;

import javax.annotation.Resource;

/**
 * Created by li on 18-9-28.
 */
public class ProduceService1 {
    //note方式
    @Resource(name ="productDao1")
    private ProductDao1 productDao1;
    @Resource(name ="orderDao1")

    private OrderDao1 orderDao1;

    public void save(){
        System.out.println("ProduceService方法执行了save方法");
        productDao1.save();
        orderDao1.save();
    }



}
