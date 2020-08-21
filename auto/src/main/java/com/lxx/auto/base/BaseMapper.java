package com.lxx.auto.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * tx基础操作mapper
 *
 * @author liaoxiaoxia
 * @version 2.3.0
 * @date 2020-8-20 11:36
 * @since JDK 1.8
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
