package dj;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dj.entity.Person;

/**
 * @author 戴俊
 *
 * @date 2018年8月6日 
 */
@RestController //用来指定 本类 是一个  Controller
public class HelloController {
	
/*	@Value("${uname}")
	private String uname;
	
	@Value("${password}")
	private String password;
	
	@RequestMapping("/")
	public String hello(){
		return "我的 第一个 SpringBoot！ HELLO！WORLD！";
	}*/
	
	/*@RequestMapping("/user")
	public String user(){
		return uname+"的密码是"+password;
	}*/
	
/*	@Autowired   //通过 spring 自动将 属性进行注入
	private Person person;
	
	@RequestMapping("/user")
	public String user(){
		return person.toString();
	}*/
	
	
	
}
