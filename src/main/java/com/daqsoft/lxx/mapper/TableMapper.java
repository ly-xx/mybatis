package com.daqsoft.lxx.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 表结构处理mapper
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019-2-15 14:28
 * @since JDK 1.8
 */
public interface TableMapper {

    /**
     * 创建表
     *
     * @param key    表名
     * @param fields 字段信息
     */
    void createTable(@Param(value = "key") String key,
                     @Param(value = "fields") List<Map> fields);

    /**
     * 更新表字段
     *
     * @param key    表名
     * @param fields 字段信息
     */
    void updateFields(@Param(value = "key") String key,
                      @Param(value = "fields") List<Map> fields);

    /**
     * 添加表字段
     *
     * @param key    表名
     * @param fields 字段信息
     */
    void addFields(@Param(value = "key") String key,
                   @Param(value = "fields") List<Map> fields);

    /**
     * 删除表字段
     *
     * @param key    表名
     * @param fields 字段信息
     */
    void dropFields(@Param(value = "key") String key,
                    @Param(value = "fields") List<Map> fields);

    /**
     * 根据表名和数据库名获取对应表字段信息
     *
     * @param tableName    表名
     * @param databaseName 数据库名
     */
    List findTableEnsembleByTableName(@Param(value = "tableName") String tableName,
                                      @Param(value = "databaseName") String databaseName);

    /**
     * 获取数据库中所有表名
     *
     * @param databaseName 数据库名
     * @return 表名集合
     */
    List getAllTableNameByDatabaseName(String databaseName);

    void update(@Param(value = "id") String id,
                @Param(value = "tabName") String tabName,
                @Param(value = "fieldMap") Map fieldMap);
}
