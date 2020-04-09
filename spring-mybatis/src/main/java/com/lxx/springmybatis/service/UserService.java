package com.lxx.springmybatis.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lxx.springmybatis.entity.User;
import com.lxx.springmybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 测试接口实现类
 *
 * @author liaoxiaoxia
 * @version 2.3.0
 * @date 2020-4-9 10:53
 * @since JDK 1.8
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 列表查询
     *
     * @return
     */
    public List<User> findAll() {
        return userMapper.selectAll();
    }

    /**
     * 分页查询
     *
     * @return
     */
    public PageInfo page() {
        PageHelper.startPage(1, 10);
        List<User> userList = userMapper.selectAll();
        PageInfo<User> pageInfo = new PageInfo(userList);
        return pageInfo;
    }
}
