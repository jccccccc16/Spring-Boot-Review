package com.cjc.springbootdemo01.handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: cjc
 * Date: 2020/10/19
 * Time: 20:43
 * To change this template use File | Settings | File Templates.
 **/
@RestController
public class HelloHandler {

    @RequestMapping("/get/spring/boot/message/hello")
    public String getMessage(){
        return "hello world";
    }

}
