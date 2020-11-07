package com.cjc.crow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by IntelliJ IDEA.
 * User: cjc
 * Date: 2020/10/28
 * Time: 20:44
 * To change this template use File | Settings | File Templates.
 **/
@MapperScan(value = "com.cjc.crow.mapper")
@EnableEurekaClient
@SpringBootApplication
public class CrowMainClass {
    public static void main(String[] args) {
        SpringApplication.run(CrowMainClass.class,args);
    }
}
