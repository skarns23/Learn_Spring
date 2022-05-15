package org.example.controller;


import lombok.AllArgsConstructor;
import org.example.model.TodoEntity;
import org.example.model.TodoRequest;
import org.example.model.TodoResponse;
import org.example.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/")
@AllArgsConstructor
@CrossOrigin
//CORS라는 이슈를 막기 위해서 사용
@RestController // controller임을 선언하는 어노테이션
public class TodoController {

    private final TodoService service;

    @PostMapping
    public ResponseEntity<TodoResponse> create(@RequestBody TodoRequest request){
        System.out.println("CREATE");
        //request에 title이 존재하지않는 경우 정상적인 요청이 아님
        if(ObjectUtils.isEmpty(request.getTitle()))
            return ResponseEntity.badRequest().build();
        if(ObjectUtils.isEmpty(request.getOrder()))
            request.setOrder(0L);
        if(ObjectUtils.isEmpty((request.getCompleted())))
            request.setCompleted(false);
        TodoEntity result = this.service.add(request);
        return ResponseEntity.ok(new TodoResponse(result));
    }

    @GetMapping("{id}")
    public ResponseEntity<TodoResponse> readOne(@PathVariable Long id){
        System.out.println("READ ONE");
        TodoEntity result = this.service.searchById(id);
        return ResponseEntity.ok(new TodoResponse(result));
    }

    @GetMapping
    public ResponseEntity<List<TodoResponse>> readAll(){
        System.out.println("READ ALL");
        List<TodoEntity> list = this.service.serarchAll(); //TodoResponse로 변환해주는 작업이 필요
        List<TodoResponse> responses = list.stream().map(TodoResponse::new)
                .collect(Collectors.toList());
        return ResponseEntity.ok(responses);

    }

    @PatchMapping("{id}")
    public ResponseEntity<TodoResponse> update(@PathVariable Long id, @RequestBody TodoRequest request){
        System.out.println("UPDATE");
        TodoEntity result = this.service.updateById(id,request);
        return ResponseEntity.ok(new TodoResponse(result));
    }

    @DeleteMapping ("{id}")
    public ResponseEntity<?> deleteOne(@PathVariable Long id){
        System.out.println("DELETE");
        this.service.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<?> deleteAll(){
        System.out.println("DELETE ALL");
        this.service.deleteAll();
        return ResponseEntity.ok().build();
    }




}
