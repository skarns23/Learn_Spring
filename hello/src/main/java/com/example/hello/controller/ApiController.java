package com.example.hello.controller;


import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController // 해당 Class는  REST API를 처리하는 Controller
@RequestMapping("/api") // RequestMapping은 URI를 지정해주는 어노테이
public class ApiController {

    @GetMapping("/hello") // 해당 주소가 http://localhost:8080/api/hello에 맵
    public String hello(){
            return "hello spring boot!";
    }

    @GetMapping(path = "/get/hello") //경로를 지정해주는 방식 http://localhost:8080/api/get/hello
    public String getHello(){
        return "get Hello";
    }

    //@RequestMapping("/get/hi") // 모든 메소드가 맵핑됨 get, post, put, delete 등
    @RequestMapping(path = "/get/hi",method = RequestMethod.GET) //해당 방식을 이용할 경우 get 메소드만 맵핑됨
    public String hi(){
        return "get hi";
    }

    // http://localhost:8080/api/path-variable/{name} name값은 변화하는 값
    @GetMapping("/path-variable/{name}")//변수를 받을때는 {}를 활용하고 안에는 변수명을 적용
    public String PathVariable(@PathVariable(name = "name") String pathName){// 매개변수로 똑같은 변수를 받는다.
        // @PathVariable String name은 같은 이름일 경우 해당 방식은 다른 이름인데 부여해야할 경우
        return "Hello "+pathName;
    }


    //query parameter의 경우 '?'로 시작하고 key = value형태이며 이어지는 경우 &를 통해 연결한다.
    //http://localhost:8080/api/query-param?user=steve&email=stev@naver.com&age=30
    @GetMapping(path = "/query-param")
    public String queryParam(@RequestParam Map<String, String>queryParam){//해당방식의 경우 들어오는 key에 대해서 모두 받을 수 있으나, key가 무엇인지 모름
        //RequestParam이라는 어노테이션붙여야 함 key=value형태이기때문에 Map으로 담을 수 있다.
        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(entry->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();
            sb.append(entry.getKey()+" = "+entry.getValue()+"\n");
        });
        return sb.toString();
    }

    @GetMapping("/query-param2")
     public String queryParam2(@RequestParam String name,@RequestParam String email, @RequestParam int age){
       //들어오는 key를 알고있다면 쓸 수 있는 명시적 방법 대신 key값이 늘면 힘듬
        return name+" "+email+" "+age;

    }

    //dto방식 현업에서 가장많이 사용함 스프링부트에서는 객체가 들어오면 query-param에 대한 판단
    // key에 있는 변수들을 객체의 변수들과 매칭을 한다.
    @GetMapping("/query-param3")
    public String queryParam3(UserRequest userRequest){
        return userRequest.toString();
    }

}
