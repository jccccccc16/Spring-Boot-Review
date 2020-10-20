package com.cjc.springbootdemo01.mapper.api;

import com.cjc.springbootdemo01.entity.Admin;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: cjc
 * Date: 2020/10/20
 * Time: 19:37
 * To change this template use File | Settings | File Templates.
 **/
public interface AdminMapper {

    /**
     * 查询全部的admin
     * @return
     */
    public List<Admin> getAll();

}
