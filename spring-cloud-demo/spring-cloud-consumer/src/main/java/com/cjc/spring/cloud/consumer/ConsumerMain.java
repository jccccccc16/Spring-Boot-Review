package com.cjc.spring.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by IntelliJ IDEA.
 * User: cjc
 * Date: 2020/10/23
 * Time: 21:05
 * To change this template use File | Settings | File Templates.
 **/
@SpringBootApplication(scanBasePackages="com.cjc.spring.cloud")
@EnableFeignClients(basePackages="com.cjc.spring.cloud") // 开启feign客户端服务，可以从注册中心使用声明式调用组件
public class ConsumerMain {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain.class,args);
    }

}
