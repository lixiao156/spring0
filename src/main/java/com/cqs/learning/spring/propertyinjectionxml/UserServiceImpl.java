package com.cqs.learning.spring.propertyinjectionxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by li on 18-9-28.
 */

@Service("userService")//<bean id = "">
public class UserServiceImpl implements UserService {

//    //注入DAO
//    @Autowired //没有set方法对象吧注解//这个名称是不能随便改的,严格按照名称注入
   @Resource(name = "userDo")//按照名称属性注入
    private UserDo userDo;
    @Override
    public void save() {
        userDo.save();
        System.out.println("UserService");

    }
}
