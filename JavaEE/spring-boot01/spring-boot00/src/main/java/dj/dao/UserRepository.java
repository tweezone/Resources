/**
 * 
 */
package dj.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dj.entity.User;

/**
 * @author 戴俊
 *
 * @date 2018年8月6日 
 */										//需要 填写 操作的表所对应的类，他的主键类型
public interface UserRepository extends JpaRepository<User, Integer>{
		// 根据 查询的 条件 直接起名就可以了
		User findById(Integer id);
}
