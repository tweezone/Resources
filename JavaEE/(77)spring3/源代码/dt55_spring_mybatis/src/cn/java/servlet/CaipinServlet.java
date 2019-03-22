/**
 * Project Name:dt55_spring_mybatis
 * File Name:CaipinServlet.java
 * Package Name:cn.java.servlet
 * Date:下午5:34:56
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package cn.java.servlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.java.entity.User;
import cn.java.service.impl.UserServiceImpl;

/**
 * Description: <br/>
 * Date: 下午5:34:56 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
public class CaipinServlet {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl us = (UserServiceImpl) context.getBean("userService");
        User user = us.getUserById(2L);
        System.out.println(user);
    }

}
