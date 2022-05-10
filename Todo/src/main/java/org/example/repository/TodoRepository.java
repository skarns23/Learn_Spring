package org.example.repository;

import org.example.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JpaRepository 제네릭으로 처음에는 데이터베이스 테이블과 연결될 객체를, 두번쨰로는 해당 객체의 id에 속하는 자료형을 넣음
@Repository
public interface TodoRepository extends JpaRepository<TodoEntity,Long> {

}
