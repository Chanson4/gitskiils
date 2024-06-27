package com.example.demo_1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class demo_controller {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public String post(@RequestBody String name)
    {
        System.out.println(name);
        return "Yes";
    }

}
