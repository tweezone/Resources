/**
 * Project Name:dt55_spring1
 * File Name:Window.java
 * Package Name:cn.java.ioc1
 * Date:上午9:49:29
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package cn.java.initAndDestroy4;

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
        Mouse mouse = (Mouse) context.getBean("mouse");
        mouse.updateMoney();
        // 3、关闭spring容器
        ClassPathXmlApplicationContext c = (ClassPathXmlApplicationContext) context;
        c.close();
    }

}
