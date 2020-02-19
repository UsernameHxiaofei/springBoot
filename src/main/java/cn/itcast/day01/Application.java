package cn.itcast.day01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 编写启动类
 */
@SpringBootApplication
@MapperScan("cn.itcast.day01")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
