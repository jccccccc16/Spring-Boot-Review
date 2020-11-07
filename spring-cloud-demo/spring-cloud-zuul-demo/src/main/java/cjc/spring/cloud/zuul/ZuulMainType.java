package cjc.spring.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by IntelliJ IDEA.
 * User: cjc
 * Date: 2020/10/27
 * Time: 17:11
 * To change this template use File | Settings | File Templates.
 **/
@EnableZuulProxy
@SpringBootApplication
public class ZuulMainType {

    public static void main(String[] args) {
        SpringApplication.run(ZuulMainType.class,args);
    }

}
