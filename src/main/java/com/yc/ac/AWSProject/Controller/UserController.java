package com.yc.ac.AWSProject.Controller;

import com.yc.ac.AWSProject.Model.User;
import com.yc.ac.AWSProject.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(produces = "application/json; charset=UTF-8")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public void login(@RequestBody User user) {
        User loginUserData = user;
    }

    @PostMapping("/insert")
    public void insert(@RequestBody User user)  {
        userService.insert(user);
    }
    @PostMapping("/update")
    public void update(@RequestBody User user)  {
        userService.update(user);

    }
    @PostMapping("/delete")
    public void delete(@RequestParam String id){
        userService.delete(id);
    }

}
