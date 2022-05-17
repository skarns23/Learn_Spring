package org.example.controller;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.model.TodoModel;
import org.example.model.TodoRequest;
import org.example.model.TodoResponse;
import org.example.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
@Slf4j //로그남길때 사용
@AllArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/")
public class TodoController {

    private final TodoService service;

    @PostMapping
    public ResponseEntity<TodoResponse> cerate(@RequestBody TodoRequest requset){
        log.info("CREATE");
        if(ObjectUtils.isEmpty(requset.getTitle())){
            return ResponseEntity.badRequest().build();
        }
        if(ObjectUtils.isEmpty(requset.getOrder()))
            requset.setOrder(0L);
        if(ObjectUtils.isEmpty(requset.getCompleted()))
            requset.setCompleted(false);
         TodoModel result = this.service.add(requset);
        return ResponseEntity.ok(new TodoResponse(result));
    }

    @GetMapping("{id}")
    public ResponseEntity<TodoResponse> readOne(@PathVariable Long id){

        log.info("READ ONE");
        TodoModel result = this.service.searchById(id);
        return ResponseEntity.ok(new TodoResponse(result));
    }

    @GetMapping
    public ResponseEntity<List<TodoResponse>> readAll(){
        log.info("READ ALL");
        List<TodoModel> list =this.service.serarchAll();
        List<TodoResponse> result = list.stream().map(TodoResponse::new)
                .collect(Collectors.toList());

        return ResponseEntity.ok(result);
    }

    @PatchMapping("{id}")
    public ResponseEntity<TodoResponse> update(@PathVariable Long id, @RequestBody TodoRequest request){
        log.info("UPDATE");
        TodoModel todoModel = this.service.updateById(id,request);
        return ResponseEntity.ok(new TodoResponse(todoModel));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<TodoModel> deleteOne(@PathVariable Long id){
        log.info("DELETE");
        this.service.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<TodoModel> deleteAll(){
        log.info("DELETE ALL");
        this.service.deleteAll();
        return ResponseEntity.ok().build();
    }

}
