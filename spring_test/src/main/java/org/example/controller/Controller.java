package org.example.controller;


import org.example.dto.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class Controller {
    ArrayList<User> list = new ArrayList<>();
    @PostMapping("/post1")
    public void post(@RequestBody Map<String,String> map){
        map.entrySet().forEach(n->{
            System.out.println(n.getKey()+" "+ n.getValue());
        });
    }

    @PostMapping("/post2")
    public User post_user(@RequestBody  User user){
        System.out.println(user);
        list.add(user);
        return user;
    }

    @GetMapping("/get1/{number}")
    public User get_number (@PathVariable(name = "number") int number){
        User user = list.get(number);
        System.out.println(user);
        return user;
    }

    @GetMapping("/get1")
    public Object[] get_all(){
        return list.stream().toArray();
    }

}
