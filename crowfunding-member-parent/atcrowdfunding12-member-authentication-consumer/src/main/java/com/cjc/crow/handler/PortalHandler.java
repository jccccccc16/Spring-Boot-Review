package com.cjc.crow.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: cjc
 * Date: 2020/11/4
 * Time: 10:47
 * To change this template use File | Settings | File Templates.
 **/
@Controller
public class PortalHandler {
    /**
     * 映射到主页面
     * @return
     */
    @RequestMapping("/")
    public String showPortalPage(){
        return "portal";
    }

}
