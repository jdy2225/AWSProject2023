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
@RequestMapping(value = "/AWSProject", produces = "application/json; charset=UTF-8")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User user) {
        User loginUserData = user;
        if (loginUserData != null) {
            return ResponseEntity.ok(loginUserData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/insert")
    public ResponseEntity insert(@RequestBody User user)  {
        if(userService.insert(user)){
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @PostMapping("/update")
    public ResponseEntity update(@RequestBody User user)  {
        if(userService.update(user)){
            return ResponseEntity.status(HttpStatus.OK).build();
        }else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @PostMapping("/delete")
    public ResponseEntity delete(@RequestParam String id){
        if(userService.delete(id)){
            return ResponseEntity.status(HttpStatus.OK).build();
        }else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
