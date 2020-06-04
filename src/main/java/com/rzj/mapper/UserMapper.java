package com.rzj.mapper;

import com.rzj.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("SELECT * FROM users")
    @Results({@Result(property = "userSex", column = "user_sex", javaType = User.class), @Result(property = "nickName", column = "nick_name")})
    List<User> getAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    @Results({@Result(property = "userSex", column = "user_sex", javaType = User.class), @Result(property = "nickName", column = "nick_name")})
    User getOne(Long id);

    @Insert("INSERT INTO users(userName,passWord,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
    void insert(User user);

    @Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
    void update(User user);


}