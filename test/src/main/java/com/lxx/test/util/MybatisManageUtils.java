package com.lxx.test.util;

import com.ibatis.common.resources.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * 简单描述一下功能
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019-2-15 11:46
 * @since JDK 1.8
 */
public class MybatisManageUtils {

    private static SqlSessionFactory sessionFactory = null;

    static {
        try {
            Reader reader = Resources.getResourceAsReader("mybatis.xml");
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession sqlSession = sessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static SqlSession getSqlSession() {
        return sessionFactory.openSession();
    }

    public static void closeSession(SqlSession sqlSession) {
        if (null != sqlSession) {
            sqlSession.close();
        }
    }
}
