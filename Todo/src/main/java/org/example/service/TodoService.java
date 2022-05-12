package org.example.service;

import lombok.AllArgsConstructor;
import org.example.model.TodoEntity;
import org.example.model.TodoRequest;
import org.example.repository.TodoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoService {

    private TodoRepository todoRepository;

    // 아이템 추가기능
    // 목록 중 특정 아이템 조회
    // 전체 목록을 조회
    // 목록 중 특정 아이템을 수정
    // 특정 아이템을 삭제
    // 전체 목록을 삭제
    public TodoEntity add (TodoRequest request) {
        TodoEntity todoEntity = new TodoEntity();
        todoEntity.setTitle(request.getTitle());
        todoEntity.setOrder(request.getOrder());
        todoEntity.setCompleted(request.getCompleted());
        return this.todoRepository.save(todoEntity);//repository의 save 메소드 repository에 객체를 저장하고, 제네릭으로 받은 타입을 반환

    }

    public TodoEntity searchById(TodoRequest request){
        return null;
    }

    public List<TodoEntity> serarchAll(){
        return null;
    }

    public TodoEntity updateById(Long id){
        return null;
    }

    public void deleteById(Long id){
    }

    public void deleteAll(){

    }
}
