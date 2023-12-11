package com.yc.ac.AWSProject.Service;

import com.yc.ac.AWSProject.Model.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {
    boolean insert(User user);

    User getUserById(User user);

    boolean update(User user);

    boolean delete(String id);
}
