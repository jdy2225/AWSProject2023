package com.yc.ac.AWSProject.Service;

import com.yc.ac.AWSProject.Mapper.UserMapper;
import com.yc.ac.AWSProject.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("UserService")
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;

    @Override
    public boolean insert(User user) {
        try {
            userMapper.insert(user);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public User getUserById(User user) {
        return userMapper.getUserById(user.getId());
    }

    @Override
    public boolean update(User user) {
        try {
            userMapper.update(user);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(String id) {
        try {
            userMapper.delete(id);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
