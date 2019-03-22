/**
 * 
 */
package dj.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dj.dao.UserRepository;
import dj.entity.User;

/**
 * @author 戴俊
 *
 * @date 2018年8月6日 
 */
@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public void addUser(){
		User user =new User();
		user.setUsername("小明明");
		user.setPassword("38492");
		userRepository.save(user);
		
			int i =1/0;
		
		User user2 =new User();
		user2.setUsername("大明明");
		user2.setPassword("38492");
		userRepository.save(user2);
	}
	
}
