package com.atguigu.mabatis.test;

import com.atguigu.mybatis.mapper.SelectMapper;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;

public class SelectMapperTest {

    @Test
    public void getUserByIdToMap() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> map = mapper.getUserByIdTomap(3);
        //{password=123456, gender=男, id=3, age=23, email=12345@qq.com, username=admin}
        System.out.println(map);
    }

    @Test
    public void getAllUserToMap() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
//        List<Map<String, Object>> mapList = mapper.getAllUserToMap();
//        mapList.forEach(System.out::println);
        Map<String, Object> mapperAllUserToMap = mapper.getAllUserToMap();
//        {2={password=1231, gender=男, id=2, age=23, email=12345@qq.com, username=修改后},
//        3={password=123456, gender=男, id=3, age=23, email=12345@qq.com, username=admin},
//        4={password=123456, gender=女, id=4, age=33, email=qq1234@123.com, username=user1}}
        System.out.println(mapperAllUserToMap);


    }
}
