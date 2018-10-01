package com.cqs.learning.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by li on 18-9-27.
 */
@Component
@Scope("prototype")
public class Student {

    private int id = 1;

    private int age=5;
}
