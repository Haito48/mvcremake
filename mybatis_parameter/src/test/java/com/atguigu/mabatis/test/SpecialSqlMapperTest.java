package com.atguigu.mabatis.test;

import com.atguigu.mybatis.mapper.SpecialSqlMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;

public class SpecialSqlMapperTest {
    @Test
    public void SpecialSqlTest() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSqlMapper mapper = sqlSession.getMapper(SpecialSqlMapper.class);
        Map<String, Object> map = mapper.getAllUserToMapByLike("u");
        System.out.println(map);
    }

    @Test
    public void insertUserTest() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSqlMapper mapper = sqlSession.getMapper(SpecialSqlMapper.class);
        User user = new User(null,"王五","13322",24,"男","123@12316.com");
        mapper.insertUser(user);
        System.out.println(user);
    }
}
