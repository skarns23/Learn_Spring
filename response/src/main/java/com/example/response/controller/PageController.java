package com.example.response.controller;


import com.example.response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    //Page를 반환하는 Controller
    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    //Json으로 내리는 방법으로는 ResponseEntity활용법과 ResponseBody활용법있음

    @ResponseBody
    @GetMapping("/user")
    public User user(){
        var user = new User();
        user.setName("steve");
        user.setAddress("daegu");
        user.setAge(12);
        user.setPhoneNumber("0105152");
        return user;
    }
}