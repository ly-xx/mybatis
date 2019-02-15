package com.daqsoft.lxx.service;

import com.daqsoft.lxx.mapper.TableMapper;
import com.daqsoft.lxx.util.MybatisManageUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 表结构操作service
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019-2-15 14:33
 * @since JDK 1.8
 */
@Service
public class TableService {

    /**
     * 创建表
     *
     * @param key    表名
     * @param fields 字段信息
     */
    public void createTable(String key, List<Map> fields) {
        SqlSession sqlSession = MybatisManageUtils.getSqlSession();
        TableMapper mybatisTables = sqlSession.getMapper(TableMapper.class);
        mybatisTables.createTable(key, fields);
        MybatisManageUtils.closeSession(sqlSession);
    }

    /**
     * 更新表结构
     *
     * @param tableName 表名
     * @param fields    字段信息
     */
    public void updateFields(String tableName, List<Map> fields) {
        SqlSession sqlSession = MybatisManageUtils.getSqlSession();
        TableMapper mybatisTables = sqlSession.getMapper(TableMapper.class);
        mybatisTables.updateFields(tableName, fields);
        MybatisManageUtils.closeSession(sqlSession);
    }

    /**
     * 添加表结构
     *
     * @param tableName 表名
     * @param fields    字段信息
     */
    public void addFields(String tableName, List<Map> fields) {
        SqlSession sqlSession = MybatisManageUtils.getSqlSession();
        TableMapper mybatisTables = sqlSession.getMapper(TableMapper.class);
        mybatisTables.addFields(tableName, fields);
        MybatisManageUtils.closeSession(sqlSession);
    }

    /**
     * 删除表字段
     *
     * @param tableName 表名
     * @param fields    字段信息
     */
    public void dropFields(String tableName, List<Map> fields) {
        SqlSession sqlSession = MybatisManageUtils.getSqlSession();
        TableMapper mybatisTables = sqlSession.getMapper(TableMapper.class);
        mybatisTables.dropFields(tableName, fields);
        MybatisManageUtils.closeSession(sqlSession);
    }

    public List getFieldsByTable(String tableName, String databaseName){
        SqlSession sqlSession = MybatisManageUtils.getSqlSession();
        TableMapper mybatisTables = sqlSession.getMapper(TableMapper.class);
        List list = mybatisTables.findTableEnsembleByTableName(tableName, databaseName);
        MybatisManageUtils.closeSession(sqlSession);
        return list;
    }

    public List getTablesByDatabase(String databaseName){
        SqlSession sqlSession = MybatisManageUtils.getSqlSession();
        TableMapper mybatisTables = sqlSession.getMapper(TableMapper.class);
        List list = mybatisTables.getAllTableNameByDatabaseName(databaseName);
        MybatisManageUtils.closeSession(sqlSession);
        return list;
    }
}
