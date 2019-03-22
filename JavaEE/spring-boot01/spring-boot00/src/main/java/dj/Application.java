package dj;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 */

/**
 * @author 戴俊
 *
 * @date 2018年8月6日 
 */
@SpringBootApplication  //代表 启动 springboot 的 主程序
//必须放在  资源文件夹下
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
