package com.cqs.learning.spring.propertyinjectionxml;

/**
 * Created by li on 18-9-28.
 */
public class Car {
    private String name;//两个属性
    private double price;

    public Car(String name, double ptice) { //注入属性 有参数构造
        this.name = name;
        this.price = ptice;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
