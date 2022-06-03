package com.example.hello.controller;


import com.example.hello.putdto.PutRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put")
    public PutRequest put(@RequestBody PutRequest putRequest){
        System.out.println(putRequest);
        return putRequest;

    }

    //Response의 경우에는 RestController에서는 객체를 내려주면 ObjectMapper를 통해서 알아서 바꿔줌


    @PutMapping("/put/{id}")
    public PutRequest putId(@RequestBody PutRequest putRequest,@PathVariable String id){
        System.out.println(putRequest);
        System.out.println(id);
        return putRequest;
    }
}
