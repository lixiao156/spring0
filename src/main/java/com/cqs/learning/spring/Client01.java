package com.cqs.learning.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by li on 18-9-27.
 */
public class Client01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        Student student = context.getBean(Student.class);
        Student student2 = context.getBean(Student.class);
        System.out.println(student);
        System.out.println(student2);
    }
}
