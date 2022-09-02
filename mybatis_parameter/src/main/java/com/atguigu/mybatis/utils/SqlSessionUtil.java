package com.atguigu.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {

    public static SqlSession getSqlSession() throws IOException {
        SqlSession sqlSession = null;
        //获取核心文件的输入流
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取Sql会话对象SqlSession,是Mybatis提供的操作数据库的对象
        //SqlSession sqlSession = sqlSessionFactory.openSession()，使用空参的不会自动提交，有参中有autocommit属性
        sqlSession = sqlSessionFactory.openSession(true);
        return sqlSession;
    }
}
