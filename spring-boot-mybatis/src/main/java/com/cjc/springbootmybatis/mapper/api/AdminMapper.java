package com.cjc.springbootmybatis.mapper.api;



import com.cjc.springbootmybatis.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

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
