package com.example.demo_1.controller;

import com.example.demo_1.entity.User;
import com.example.demo_1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class user_controller {

//    @GetMapping("/user/{id}")
//    public String getUserById(@PathVariable int id){
//        System.out.println(id);
//        return "get";
//    }
//
//    @PostMapping("/user")
//    public String addUser(int id){
//        System.out.println(id);
//        return "add";
//    }

    @Autowired
    private UserMapper userMapper;
    @GetMapping("/user")
    public String query(){
        List<User> list =  userMapper.find();
        System.out.println(list);
        return "query";
    }



}
