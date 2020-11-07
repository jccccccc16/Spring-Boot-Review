package com.cjc.spring.cloud.consumer.handler;

import com.cjc.spring.cloud.entity.Employee;
import com.cjc.spring.cloud.handler.EmployeeRemoteService;
import com.cjc.spring.cloud.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: cjc
 * Date: 2020/10/23
 * Time: 21:03
 * To change this template use File | Settings | File Templates.
 **/
@RestController
public class EmployeeHandler {

    @Autowired
    private EmployeeRemoteService employeeRemoteService;


    @RequestMapping("/consumer/get/employee")
    public Employee getEmployee(){

        return employeeRemoteService.getEmployee();
    }

    @RequestMapping("/consumer/test/hystrix")
    public ResultEntity testHystrix(
            @RequestParam("signal") String signal){

        return employeeRemoteService.getEmpWithCircuitBreaker(signal);

    }

}
