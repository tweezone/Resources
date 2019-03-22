/**
 * 
 */
package dj.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 戴俊
 *
 * @date 2018年8月6日 
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
	private  String username;
	private  String password;
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
		return "Person [username=" + username + ", password=" + password + "]";
	}
	
	
}
