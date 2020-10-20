package com.cjc.springbootdemo01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@MapperScan(value = "com.cjc.springbootdemo01")
@SpringBootApplication
public class SpringBootDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemo01Application.class, args);
    }

}
