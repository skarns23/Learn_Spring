package com.example.hello.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DelApiController {

    //Delete의 경우 값이 사라지는 것과 값이 없어도 활동자체가 같아서 멱등성 만족
  @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id, @RequestParam String account){
        System.out.println(id);
        System.out.println(account);
    }

}
