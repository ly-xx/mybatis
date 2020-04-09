package com.lxx.springmybatis.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * mapper基础类（不能和启动类的MapperScan扫描类放在同一路径，不然启动会抛异常）
 *
 * @author liaoxiaoxia
 * @version 2.3.0
 * @date 2020-4-9 10:47
 * @since JDK 1.8
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
