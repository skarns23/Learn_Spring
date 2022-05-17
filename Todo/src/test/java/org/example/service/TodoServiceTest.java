package org.example.service;


import org.example.model.TodoModel;
import org.example.model.TodoRequest;
import org.example.repository.TodoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.AdditionalAnswers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.server.ResponseStatusException;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class  )
class TodoServiceTest {

    //Mock을 사용하는 이유 외부시스템에 의존하지 않고 자체적으로 실행이 가능해야하며
    // 네트워크 연결이 없어도 사용가능 및 실제 DB를 사용하지 않아서 안전
    @Mock
    private TodoRepository todoRepository;

    @InjectMocks
    private TodoService todoservice;
    @Test
    void add() {
        when(this.todoRepository.save(any(TodoModel.class)))
                .then(AdditionalAnswers.returnsFirstArg());

        TodoRequest expected = new TodoRequest();
        expected.setTitle("Test Title");
        TodoModel actual = todoservice.add(expected); //service를 통해서 add하면 TodoEntitiy형식의 객체가 나옴

        assertEquals(expected.getTitle(),actual.getTitle()); // aseertEqualse를 통해서 둘의 title값이 같은 지를 판단
    }

    @Test
    void searchById() {
        TodoModel entity  =  new TodoModel();
        entity.setId(123L);
        entity.setCompleted(false);
        entity.setTitle("TITLE");
        entity.setOrder(0L);
        Optional<TodoModel> optional = Optional.of(entity);
        given(this.todoRepository.findById(anyLong()))
                .willReturn(optional);

        TodoModel actual = this.todoservice.searchById(123L);
        TodoModel expected = optional.get();
        assertEquals(expected.getId(),actual.getId());
        assertEquals(expected.getTitle(),actual.getTitle());
        assertEquals(expected.getCompleted(),actual.getCompleted());
        assertEquals(expected.getOrder(),actual.getOrder());

    }

    @Test
    public void searchByIdFailed(){
        given(this.todoRepository.findById(anyLong()))
                .willReturn(Optional.empty());
        assertThrows(ResponseStatusException.class,()->{
            this.todoservice.searchById(123L);
        });
    }
}