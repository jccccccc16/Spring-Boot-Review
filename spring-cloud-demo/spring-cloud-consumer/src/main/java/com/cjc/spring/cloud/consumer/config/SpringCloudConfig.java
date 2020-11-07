package com.cjc.spring.cloud.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by IntelliJ IDEA.
 * User: cjc
 * Date: 2020/10/23
 * Time: 21:04
 * To change this template use File | Settings | File Templates.
 **/
@Configuration
public class SpringCloudConfig {

    @Bean
    @LoadBalanced // 使得restTemplate有负载均衡的功能，通过ribbon访问提供者集群
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
