package com.lxx.auto.service.impl;

import com.lxx.auto.entity.TestAddress;
import com.lxx.auto.mapper.AddressMapper;
import com.lxx.auto.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liaoxiaoxia
 * @version 2.3.0
 * @date 2020-8-20 11:32
 * @since JDK 1.8
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<TestAddress> findAll() {
        return addressMapper.selectAll();
//        return addressMapper.test();
    }
}
