package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.criteria.Predicate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoResponse {
    private Long id;
    private String title;
    private Long order;
    private Boolean completed;
    private String url;

    //코드를 편하게 활용하기 위해 TodoEntity를 매개변수로 갖는생성자 생성
    public TodoResponse(TodoEntity todoEntity){
        this.id = todoEntity.getId();
        this. title = todoEntity.getTitle();
        this.order = todoEntity.getOrder();
        this.completed = todoEntity.getCompleted();

        this.url = "http://localhost:8080/" +this.id;
        //정적화 되어있는 주소값이 코드안에 있는 것이 좋은 패턴은 아님 매번 수정을 해줘야하기때문
    }
}
