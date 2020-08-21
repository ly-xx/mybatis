package com.lxx.auto.controller;

import com.lxx.auto.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liaoxiaoxia
 * @version 2.3.0
 * @date 2020-8-20 11:38
 * @since JDK 1.8
 */
@RestController
@RequestMapping(value = "/test")
public class AddressController {

    @Autowired
    AddressService addressService;

    @RequestMapping(value = "/selectAll")
    public Object selectAll(){
       return addressService.findAll();
    }
}
