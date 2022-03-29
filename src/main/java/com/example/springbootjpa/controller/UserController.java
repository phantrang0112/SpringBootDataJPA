package com.example.springbootjpa.controller;

import com.example.springbootjpa.DTO.UserDTO;
import com.example.springbootjpa.entity.user;
import com.example.springbootjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("user")
    public List<user> getAll(){
        List<user> listUser= userService.fillall();
        return listUser;
    }
    @PostMapping("user")
    public UserDTO postUser(@RequestBody UserDTO newUser){
             System.out.println(newUser.getName());
            UserDTO userDTO= userService.postUser(newUser);
            return userDTO;
    }
    @PutMapping("user")
    public UserDTO putUser(@RequestBody UserDTO updateUser){
        System.out.println(updateUser.getUserId());
        UserDTO userDTO= userService.putUser(updateUser);
        return  userDTO;
    }
    @DeleteMapping("user/{id}")
    public int deleteUser(@PathVariable("id") Long id) {
        System.out.println(id+"id");
        int success= userService.deleteUser(id);
        return success;
    }
}
