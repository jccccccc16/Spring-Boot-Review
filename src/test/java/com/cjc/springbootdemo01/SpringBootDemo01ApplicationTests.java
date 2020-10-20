package com.cjc.springbootdemo01;

import com.cjc.springbootdemo01.mapper.api.AdminMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemo01ApplicationTests {

    @Resource
    AdminMapper adminMapper;

    @Test
    public void contextLoads() {

        System.out.println(adminMapper);


    }

}
