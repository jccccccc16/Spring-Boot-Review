package com.cjc.spring.cloud.handler;


import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: cjc
 * Date: 2020/10/25
 * Time: 21:15
 * To change this template use File | Settings | File Templates.
 * 客户端降级，当服务端不可用时，调用fallbackfactory传入的接口的方法，以便系统继续运行下去
 **/
@Component
public class EmployeeRemoteFallBackFactory implements FallbackFactory<EmployeeRemoteService> {
    public EmployeeRemoteService create(final Throwable throwable) {
        return new EmployeeRemoteService() {
            public Employee getEmployee() {
                return null;
            }

            public ResultEntity<Employee> getEmpWithCircuitBreaker(String signal) {
                return ResultEntity.failed("调用服务端失败，客户端执行降级，以便系统继续正常运行,"+throwable.getMessage());
            }
        };
    }
}
