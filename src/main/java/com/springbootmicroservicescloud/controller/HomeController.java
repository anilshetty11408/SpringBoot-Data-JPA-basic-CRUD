package com.springbootmicroservicescloud.controller;

import com.springbootmicroservicescloud.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String helloWorld() {

        return "Hello World";
    }

    @GetMapping("/user")
    public User user() {
        User user = new User();
        user.setId("1");
        user.setName("Anil");
        user.setEmailId("anil@gmail.com");

        return user;
    }

    @GetMapping("{id}")
    public String pathVariable(@PathVariable String id){
        return "The path variable is : "+id;
    }

    @GetMapping("{id1}/{id2}")
    public String pathVariableIDs(@PathVariable String id1,@PathVariable String id2){
        return "The path variable are : "+id1+";"+id2;
    }

    @GetMapping("{id}/{id2}")
    public String pathVariableIDsName(@PathVariable("id2") String name){
        return "The path variable are : "+name;
    }

    @GetMapping("/requestParam")
    public String requestParam(@RequestParam String name,@RequestParam(name = "email",required = false,defaultValue = "")  String emailId){
        return "Your name is :"+name+"-------"+emailId;

    }

}
