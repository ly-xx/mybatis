package com.lxx.springmybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 启动类
 *
 * @author liaoxiaoxia
 * @version 2.3.0
 * @date 2020-4-9 10:51
 * @since JDK 1.8
 */
@SpringBootApplication
@MapperScan("com.lxx.springmybatis.mapper")
public class SpringMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisApplication.class, args);
    }

}
