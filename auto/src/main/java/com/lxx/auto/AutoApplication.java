package com.lxx.auto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;


@MapperScan({"com.lxx.auto.mapper","com.gitee.sunchenbin.mybatis.actable.dao"})
@ComponentScan(basePackages = {"com.gitee.sunchenbin.mybatis.actable.manager.*","com.lxx.auto.*"})
@SpringBootApplication
public class AutoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoApplication.class, args);
    }

}
