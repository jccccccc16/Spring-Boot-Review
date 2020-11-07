package com.cjc.spring.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * User: cjc
 * Date: 2020/10/23
 * Time: 21:07
 * To change this template use File | Settings | File Templates.
 **/
// 启用断路器功能
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class ProviderMain {

    public static void main(String[] args) {
        SpringApplication.run(ProviderMain.class,args);
    }

}
