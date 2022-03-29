package com.example.springbootjpa.service.implservice;

import com.example.springbootjpa.DTO.UserDTO;
import com.example.springbootjpa.entity.role;
import com.example.springbootjpa.entity.user;
import com.example.springbootjpa.repository.RoleRepository;
import com.example.springbootjpa.repository.UserRepository;
import com.example.springbootjpa.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    public  void test(){

    }

    @Override
    public List<user> fillall() {
        List<user> listUser=  userRepository.findAll();
        return listUser;
    }

    @Override
    public UserDTO postUser(UserDTO userDTO) {
        user user= new user();
        user.setName(userDTO.getName());
        role role= roleRepository.getById(userDTO.getRoleId());
        user.setRole(role);
       userRepository.save(user);
       return userDTO;
    }

    @Override
    public UserDTO putUser(UserDTO userDTO) {
        user updateUser = userRepository.getById(userDTO.getUserId());

        if(updateUser!=null){
            user user= updateUser;
            user.setName(userDTO.getName());
            userRepository.save(user);
            return  userDTO;
        }
         return null;
    }

    @Override
    public int deleteUser(Long id) {
        user user= userRepository.getById(id);
        if(user!=null){
            userRepository.deleteById(user.getId());
            return 1;
        }
        return 0;
    }
}