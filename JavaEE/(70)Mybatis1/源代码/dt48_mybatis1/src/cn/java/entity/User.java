/**
 * Project Name:dt48_mybatis1
 * File Name:User.java
 * Package Name:cn.java.entity
 * Date:下午4:03:45
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
*/

package cn.java.entity;

/**
 * Description: User需要满足JavaBean格式<br/>
 * Date: 下午4:03:45 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
public class User {
    private Long id;// 主键

    private String username;// 用户名

    private String password;// 密码

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
    }
}
