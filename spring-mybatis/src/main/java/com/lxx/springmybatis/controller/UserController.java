package com.lxx.springmybatis.controller;

import com.lxx.springmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 列表、分页查询
 *
 * @author liaoxiaoxia
 * @version 2.3.0
 * @date 2020-4-9 10:57
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 列表查询
     *
     * @return
     */
    @RequestMapping(value = "/findAll")
    public Object findAll() {
        return userService.findAll();
    }

    /**
     * 分页查询
     *
     * @return
     */
    @RequestMapping(value = "/page")
    public Object page() {
        return userService.page();
    }
}
