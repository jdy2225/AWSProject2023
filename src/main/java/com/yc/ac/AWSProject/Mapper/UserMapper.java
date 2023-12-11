package com.yc.ac.AWSProject.Mapper;

import com.yc.ac.AWSProject.Model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    void insert(User user);

    User getUserById(String id);

    void update(User user);

    void delete(String id);
}