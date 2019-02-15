package com.daqsoft.lxx.controller;

import com.daqsoft.lxx.service.TableService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 表结构操作ctrl
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019-2-15 14:35
 * @since JDK 1.8
 */
@RestController
public class TableCtrl {

    @Autowired
    private TableService service;

    /**
     * 创建表
     *
     * @param tableName 表名
     * @param fields    字段名
     * @return 操作提示
     */
    @RequestMapping(value = "createTable")
    public Object createTable(String tableName, String fields) {
        JSONArray myJsonArray = JSONArray.fromObject(fields);
        service.createTable(tableName, myJsonArray);
        return "success";
    }

    /**
     * 更新表字段
     *
     * @param tableName 表名
     * @param fields    字段名
     * @return 操作提示
     */
    @RequestMapping(value = "updateField")
    public Object updateField(String tableName, String fields) {
        JSONArray myJsonArray = JSONArray.fromObject(fields);
        service.updateFields(tableName, myJsonArray);
        return "success";
    }

    /**
     * 添加表字段
     *
     * @param tableName 表名
     * @param fields    字段名
     * @return 操作提示
     */
    @RequestMapping(value = "addField")
    public Object addField(String tableName, String fields) {
        JSONArray myJsonArray = JSONArray.fromObject(fields);
        service.addFields(tableName, myJsonArray);
        return "success";
    }

    /**
     * 删除表字段
     *
     * @param tableName 表名
     * @param fields    字段名
     * @return 操作提示
     */
    @RequestMapping(value = "dropFields")
    public Object dropFields(String tableName, String fields) {
        JSONArray myJsonArray = JSONArray.fromObject(fields);
        service.dropFields(tableName, myJsonArray);
        return "success";
    }

    /**
     * 获取数据库表字段信息
     *
     * @param tableName 表名
     * @return 字段信息
     */
    @RequestMapping(value = "getFieldsByTable")
    public Object getAllFieldByTableName(String tableName) {
        return service.getFieldsByTable(tableName, "test_mybatis");
    }

    /**
     * 获取数据库表名
     *
     * @param databaseName 数据库名称
     * @return 表名
     */
    @RequestMapping(value = "getTableByDatabaseName")
    public Object getAllTableNameByDatabaseName(String databaseName) {
        return service.getTablesByDatabase(databaseName);
    }
}
