package com.cqs.learning.spring;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by li on 18-9-27.
 */
@Component
public class Teacher implements InitializingBean{

    @Autowired
    private Student student;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(student);
    }
}
