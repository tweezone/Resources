/**
 * Project Name:dt48_mybatis1
 * File Name:UserDaoImpl.java
 * Package Name:cn.java.dao.impl
 * Date:下午3:39:43
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
*/

package cn.java.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.java.entity.User;

/**
 * Description: <br/>
 * Date: 下午3:39:43 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
public class UserDaoImpl {
    /**
     * 
     * Description: 获取users表中的所有数据记录<br/>
     *
     * @author dingP
     * @throws IOException
     */
    @Test
    public void getAllUser() throws IOException {
        // 1、启动mybatis框架
        // SqlSession---->SqlSessionFactory---->SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
        // 将mybatis.xml文件转化成流
        InputStream ins = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory ssf = sfb.build(ins);
        SqlSession session = ssf.openSession();
        // 2、调用局部配置文件中的sql语句
        List<User> userList = session.selectList("cn.java.dao.impl.UserDaoImpl.getAllUser");
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void getAllUser22() throws IOException {
        // 1、启动mybatis框架
        // SqlSession---->SqlSessionFactory---->SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
        // 将mybatis.xml文件转化成流
        InputStream ins = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory ssf = sfb.build(ins);
        SqlSession session = ssf.openSession();
        // 2、调用局部配置文件中的sql语句
        List<Map<String, Object>> userList = session.selectList("cn.java.dao.impl.UserDaoImpl.getAllUser22");
        for (Map<String, Object> map : userList) {
            System.out.println(map);
        }
    }
}
