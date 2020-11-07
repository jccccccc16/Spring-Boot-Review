package com.cjc.spring.cloud.provider.handler;

import com.cjc.spring.cloud.entity.Employee;
import com.cjc.spring.cloud.util.ResultEntity;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by IntelliJ IDEA.
 * User: cjc
 * Date: 2020/10/23
 * Time: 21:00
 * To change this template use File | Settings | File Templates.
 **/
@RestController
public class EmployeeRemoteService {


    @RequestMapping("/provider/get/employee/remote")
    public Employee getEmployee(){




        return new Employee();
    }

    @HystrixCommand(fallbackMethod = "getEmpWithCircuitBreakerBackUp")  // 熔断时的备用方法
    @RequestMapping("/provider/get/emp/circuit/breaker")
    public ResultEntity<Employee> getEmpWithCircuitBreaker(@RequestParam("signal") String signal) throws InterruptedException {

        // 模拟出现异常
        if("quick-bang".equals(signal)){
            throw new RuntimeException();
        }

        // 模拟超时
        if("slow-bang".equals(signal)){
            Thread.sleep(5000);
        }

        return  ResultEntity.successWithData(new Employee());
    }

    public ResultEntity<Employee> getEmpWithCircuitBreakerBackUp(@RequestParam("signal") String signal) throws InterruptedException {


        String message = "熔断了，使用了备用的方案";

        return  ResultEntity.failed(message);
    }




}
