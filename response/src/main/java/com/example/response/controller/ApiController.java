package com.example.response.controller;


import com.example.response.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    //return 값 : TEXT
    @GetMapping("/text")
    public String text(@RequestParam String account){
        return account;
    }

    //Json
    // request가 오면 -> object mapper를 통해서 -> object -> method -> object -> object mapper -> response형태로 바뀜
    @PostMapping("/post")
    public User post(@RequestBody User user){

        return user; // 200 ok
    }


    //우리가 원하는 HTTP응답을 내려주기위해서는 Response entity라는 객체를 통해서 내려줘야
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
        //status를 통해서 원하는 응답을 내려주고, hody에는 데이터를 넣어줌 (json형태)
    }
}
