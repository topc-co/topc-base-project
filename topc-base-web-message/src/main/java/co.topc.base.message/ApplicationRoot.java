package co.topc.base.message;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zaqweb
 * @date 2019-06-30 21:39
 */
@SpringBootApplication(scanBasePackages = {"co.topc"})
@MapperScan(basePackages = {"co.topc"})
public class ApplicationRoot {
  public static void main(String[] args) {
    SpringApplication.run(ApplicationRoot.class, args);
  }
}
