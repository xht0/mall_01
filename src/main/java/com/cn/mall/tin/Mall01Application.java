package com.cn.mall.tin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.cn.mall.tin.mbg.mapper")
public class Mall01Application {

    public static void main(String[] args) {
        SpringApplication.run(Mall01Application.class, args);
    }

}
