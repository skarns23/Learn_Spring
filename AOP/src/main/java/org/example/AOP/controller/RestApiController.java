package org.example.AOP.controller;


import org.example.AOP.annotation.Decode;
import org.example.AOP.annotation.Timer;
import org.example.AOP.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping("/get/{id}")
    public String get(@PathVariable Long id, @RequestParam String name){
        System.out.println("get method");
        System.out.println("get method "+id);
        System.out.println("get method "+name);
        return id+" "+name;
    }

    @PostMapping("/post")
    public User post(@RequestBody User user){
        System.out.println("post method : "+user);
        return user;
    }
    @Timer
    @DeleteMapping("/delete")
    public  void delete(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Decode
    @PutMapping("/put")
    public User out(@RequestBody User user){
        System.out.println("put method : "+user);
        return user;
    }
}
