package com.cjc.crow.api;

import com.cjc.crow.entity.Member;
import com.cjc.crow.util.ResultEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by IntelliJ IDEA.
 * User: cjc
 * Date: 2020/11/1
 * Time: 10:07
 * To change this template use File | Settings | File Templates.
 **/
@FeignClient("crow-mysql")
public interface MySqlRemoteService {

    @RequestMapping("/get/memberpo/by/login/acct/remote")
    ResultEntity<Member> getMemberByLoginAcct(@RequestParam("loginacct") String loginAcct);

    @RequestMapping("/save/member/remote")
    public ResultEntity<Member> saveMember(@RequestBody Member member);

}
