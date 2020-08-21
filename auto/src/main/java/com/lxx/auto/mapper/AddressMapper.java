package com.lxx.auto.mapper;

import com.lxx.auto.base.BaseMapper;
import com.lxx.auto.entity.TestAddress;

import java.util.List;

/**
 * 基础测试类
 *
 * @author liaoxiaoxia
 * @version 2.3.0
 * @date 2020-8-20 11:30
 * @since JDK 1.8
 */
public interface AddressMapper extends BaseMapper<TestAddress> {

    /**
     * 测试
     *
     * @return
     */
    List<TestAddress> test();
}
