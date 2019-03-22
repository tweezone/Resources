/**
 * Project Name:dt47_struts2_1
 * File Name:FrontAction.java
 * Package Name:cn.java.action.front
 * Date:下午4:21:28
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
*/

package cn.java.action.front;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Description: <br/>
 * Date: 下午4:21:28 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
public class FrontAction extends ActionSupport {
    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login() {// 配置虚拟路径
        System.out.println("hello struts2!!!");
        if ("admin".equals(username) && "123".equals(password)) {// 登录成功
            return "success";// pages/front/success.jsp
        } else {// 登录失败
            return "fail";
        }
    }

    public String register() {
        System.out.println("register............");
        return "aaa";
    }

}
