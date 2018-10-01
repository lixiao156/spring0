package com.cqs.learning.spring.propertyinjectionxml.produceservicexml;

/**
 * Created by li on 18-9-28.
 */
public class ProduceService {
    //xml方式需要构造方法,注解
    private ProductDao productDao;
    private OrderDao orderDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void save(){
        System.out.println("ProduceService方法执行了save方法");
        productDao.save();
        orderDao.save();
    }



}
