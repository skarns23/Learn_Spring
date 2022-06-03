package com.example.hello.controller;


import com.example.hello.dto.PostRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    public void post(@RequestBody Map<String,Object> requestData){
        //Post형식의 경우에는 body형식으로 보내기때문에 RequestBody Annotation으로 설정한다.
        requestData.forEach((key, value) -> {
            System.out.println("key :" + key);
            System.out.println("value :" + value);
        });

    }

    @PostMapping("/post-dto")
    public void postDto(@RequestBody PostRequest postRequest){
        System.out.println(postRequest);

    }

}

