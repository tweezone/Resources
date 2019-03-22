/**
 * Project Name:dt55_spring_mybatis
 * File Name:UserServiceImpl.java
 * Package Name:cn.java.service.impl
 * Date:下午5:32:42
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package cn.java.service.impl;
/**
 * Description:	   <br/>
 * Date:     下午5:32:42 <br/>
 * @author   丁鹏
 * @version  
 * @see 	 
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.java.entity.User;
import cn.java.mapper.UserMapper;
import cn.java.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper um;

    /**
     * 简单描述该方法的实现功能（可选）.
     * 
     * @see cn.java.service.impl.UserService#getUserById(java.lang.Long)
     */
    @Override
    public User getUserById(Long id) {
        return um.selectByPrimaryKey(id);
    }
}
