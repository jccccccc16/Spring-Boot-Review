package com.cjc.springbootmybatis;


import com.cjc.springbootmybatis.mapper.api.AdminMapper;
import com.cjc.springbootmybatis.mapper.api.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisApplicationTests {

	@Resource
	private AdminMapper adminMapper;

	@Resource
	private Student student;

	@Test
	public void contextLoads() {

		System.out.println(adminMapper);
		System.out.println(student);

	}

}
