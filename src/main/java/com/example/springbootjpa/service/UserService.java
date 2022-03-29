package com.example.springbootjpa.service;

import com.example.springbootjpa.DTO.UserDTO;
import com.example.springbootjpa.entity.user;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public void test();
    public List<user> fillall();
    public UserDTO postUser(UserDTO userDTO);
    public UserDTO putUser(UserDTO userDTO);
    public int deleteUser(Long ìd);
}
