package com.cqs.learning.spring.propertyinjectionxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 *用户Do的实现类
 * Created by li on 18-9-28.
 */

/*
@Component :组件 修饰一个类交给Spring管理
这个注解有三个衍生的注解如下:
@Controller:web层
@Service : service层(业务层)
@Repository:dao层
结构更加明显
 */
//@Component("userDo")//相当于<bean id = "userDao" class="/home/li/IdeaProjects/spring0/src/main/java/com/cqs/learning/spring/propertyinjectionxml/UserDoImpl.java">

@Repository("userDo")
public class UserDoImpl implements UserDo{
    @Value("王东")
    private String name ;
//@Value("王东")
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    @Override
    public void save() {
        System.out.println("Do可以执行了-----"+name);


    }
}
