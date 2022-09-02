package com.atguigu.mybatis.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface SelectMapper {

    Map<String,Object> getUserByIdTomap(@Param("id") Integer id);

    //1.将map装入List集合中
    //List<Map<String,Object>> getAllUserToMap();

    //2.用Map装Map，并用@MapKey注解设置Map的Key，将装入的map作为value
    //@MapKey:将设置的value作为方法执行完后返回的map的Key，以map为value，且id的值与map中的id的值对应,将查询的某个字段的值作为大的Map的键
    //{2={password=1231, gender=男, id=2, age=23, email=12345@qq.com, username=修改后}, 3={password=123456, gender=男, id=3, age=23, email=12345@qq.com, username=admin}, 4={password=123456, gender=女, id=4, age=33, email=qq1234@123.com, username=user1}}
    @MapKey("id")
   Map<String,Object> getAllUserToMap();
}
