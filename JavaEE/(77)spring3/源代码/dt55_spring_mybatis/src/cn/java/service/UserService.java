/**
 * Project Name:dt55_spring_mybatis
 * File Name:UserService.java
 * Package Name:cn.java.service.impl
 * Date:下午5:33:54
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package cn.java.service;

import cn.java.entity.User;

/**
 * Description: <br/>
 * Date: 下午5:33:54 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
public interface UserService {

    User getUserById(Long id);

}
