package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SpecialSqlMapper {
    @MapKey("id")
    Map<String,Object> getAllUserToMapByLike(@Param("mohu") String mohu);

    List<User> getUserList(@Param("tableName") String tableName);

    void insertUser(User user);
}
