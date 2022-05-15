package org.example.service;

import org.example.model.TodoEntity;
import org.example.model.TodoRequest;
import org.example.repository.TodoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.AdditionalAnswers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TodoServiceTest {

    @Mock
    private  TodoRepository todoRepository;

    @InjectMocks
    private TodoService todoService;
    //Mock을 사용하는 이유는 외부시스템에 의존하지않고 자체테스트를 진행할 수 있음
    //네트워크 연결이 되지않아도 테스트가 가능하며 실제 DB를 사용하지 않음
    @Test
    void add() {
        when(this.todoRepository.save(any(TodoEntity.class))) //여기서 any관련 메소드 import할때 mock껄로 해야함 아니면 에러 발생
                .then(AdditionalAnswers.returnsFirstArg());
        TodoRequest expected = 

    }

    @Test
    void searchById() {
    }
}