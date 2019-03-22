package dj;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dj.dao.UserRepository;
import dj.entity.User;
import dj.service.UserService;

/**
 * @author 戴俊
 *
 * @date 2018年8月6日 
 */
@RestController //用来指定 本类 是一个  Controller
public class HelloController2 {
	 @Autowired
	 private UserService userService;
	
/*	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	//告知截取的是哪个属性
	public String user(@PathVariable("id") Integer id){
		return "id: "+id;
	}*/
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	//告知截取的是哪个属性
	public String user1(User user){
		return user.toString();
	}
	
	
	/*@RequestMapping(value="/users",method=RequestMethod.GET)
	public List<User> user2(){
		return userRepository.findAll();
	}
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	public User user3(@PathVariable("id") Integer id){
		return userRepository.findById(id);
	}*/
	@RequestMapping(value="/adduser",method=RequestMethod.GET)
	public String user3(){
		userService.addUser();
		
		return "成功了";
	}
}
