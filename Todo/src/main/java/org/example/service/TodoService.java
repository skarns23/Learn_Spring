package org.example.service;

import lombok.AllArgsConstructor;
import org.example.model.TodoEntity;
import org.example.model.TodoRequest;
import org.example.repository.TodoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

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

    public TodoEntity searchById(Long id)
    {
        // todo리포지터리의 findById 메소드를 활용하여 탐색, Id가 없는 경우 Not_Found exception 발생
        return this.todoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public List<TodoEntity> serarchAll(){

        return this.todoRepository.findAll();
    }

    public TodoEntity updateById(Long id,TodoRequest request){
        TodoEntity todoEntity = this.searchById(id);
        if(request.getTitle() !=null){
            todoEntity.setTitle(request.getTitle());
        }
        if(request.getOrder() !=null){
            todoEntity.setOrder(request.getOrder());
        }
        if(request.getCompleted() !=null){
            todoEntity.setCompleted((request.getCompleted()));
        }
        // 업데이트의 경우 리포지터리에서 save 메소드를 활용함
        return this.todoRepository.save(todoEntity);
    }

    public void deleteById(Long id){
        this.todoRepository.deleteById(id);
    }

    public void deleteAll(){
        this.todoRepository.deleteAll();
    }
}
