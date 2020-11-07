package com.cjc.spring.cloud.handler;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by IntelliJ IDEA.
 * User: cjc
 * Date: 2020/10/24
 * Time: 22:28
 * To change this template use File | Settings | File Templates.
 **/
@FeignClient(value="provider",fallbackFactory = EmployeeRemoteFallBackFactory.class)
public interface EmployeeRemoteService {

    @RequestMapping("/provider/get/employee/remote")
    public Employee getEmployee();


    @RequestMapping("/provider/get/emp/circuit/breaker")
    public ResultEntity<Employee> getEmpWithCircuitBreaker(@RequestParam("signal") String signal);

}
