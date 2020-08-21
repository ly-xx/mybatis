package com.lxx.auto.service;

import com.lxx.auto.entity.TestAddress;

import java.util.List;

/**
 * 测试
 * @author liaoxiaoxia
 * @version 2.3.0
 * @date 2020-8-20 11:31
 * @since JDK 1.8
 */
public interface AddressService {

    List<TestAddress> findAll();
}
