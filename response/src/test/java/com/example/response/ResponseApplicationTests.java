package com.example.response;

import com.example.response.dto.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//object mapper 공부
@SpringBootTest
class ResponseApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		//Object mapper의 역할
		//TEXT Json -> Object로 바꿈
		//Object를 -> TEXT Json으로 바꿔준다.

		//해당 사용 예제는 controller에서 Request로 Json(Text)형태가 들어오 -> object로 바꿔줌
		// response obejct로 반환하면 자동적으로 Json(Text)로 바꿔서 반환

		//object->text의 특징인 getMethod의 활용때문에 objectMapper에 이용되는 class의 경우에는 method에서 get이라는 명칭을 빼야한다.

		var objectMapper = new ObjectMapper();
		//object -> text
		//object에서 text로 갈때는 getMethod를 활용한다.
		var user = new User();
		user.setName("steve");
		user.setAge(10);
		user.setPhoneNumber("010");
		user.setAddress("Daegu");
		var text = objectMapper.writeValueAsString(user);
		System.out.println(text);

		//text -> object
		//text->object mapper의 특징은 default constructor가 필요하다.
		//objectMapper의 readvalue()라는 메소드는 매개변수로 json(text), 바꿀 Class를 넣어주면된다.
		var objectUser = objectMapper.readValue(text,User.class);
		System.out.println(objectUser);
	}

}
