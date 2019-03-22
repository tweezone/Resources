/**
 * Project Name:dt55_spring2
 * File Name:Window.java
 * Package Name:cn.java.dao.impl
 * Date:上午11:20:21
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package cn.java.dao.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description: <br/>
 * Date: 上午11:20:21 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
public class Window {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AppDaoImpl appDaoImpl = (AppDaoImpl) context.getBean("appDaoImpl");
        appDaoImpl.aaa();
    }

}
