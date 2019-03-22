/**
 * Project Name:dt55_spring1
 * File Name:Mouse.java
 * Package Name:cn.java.initAndDestroy4
 * Date:上午11:33:40
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package cn.java.initAndDestroy4;

/**
 * Description: <br/>
 * Date: 上午11:33:40 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
public class Mouse {

    public void init() {
        System.out.println("Mouse...........init()");
    }

    public Mouse() {
        System.out.println("Mouse....无参构造方法");
    }

    public void behavior() {
        System.out.println("老鼠喜欢磨牙");
    }

    public void updateMoney() {
        // 1、update money set money=money-200 where id=1
        // 2、update money set money=money+200 where id=2
        System.out.println("老鼠偷钱了");
    }

    public void destroy() {
        System.out.println("Mouse...............destroy()");
    }

}
