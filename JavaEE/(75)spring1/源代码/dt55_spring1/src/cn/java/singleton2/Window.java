/**
 * Project Name:dt55_spring1
 * File Name:Window.java
 * Package Name:cn.java.ioc1
 * Date:上午9:49:29
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package cn.java.singleton2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description: <br/>
 * Date: 上午9:49:29 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
public class Window {

    public static void main(String[] args) {

        // 1、启动spring框架
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2、获取spring容器中的某一创建好的对象
        Duck duck1 = (Duck) context.getBean("鸭子");
        Duck duck2 = (Duck) context.getBean("dk");
        System.out.println(duck1);
        System.out.println(duck2);

    }

}
