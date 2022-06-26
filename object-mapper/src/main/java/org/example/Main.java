package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.example.dto.Car;
import org.example.dto.User;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        out.println("Hello world!");

        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User();
        user.setName("홍길동");
        user.setAge(10);

        Car car1 = new Car();
        car1.setName("K5");
        car1.setCarNumber("11가 1111");
        car1.setType("sedan");
        Car car2 = new Car();
        car2.setName("q5");
        car2.setCarNumber("22가 2222");
        car2.setType("SUV");
        List<Car> carList = Arrays.asList(car1,car2);
        user.setCars(carList);
        String json = objectMapper.writeValueAsString(user);
        out.println(json);
        JsonNode jsonNode = objectMapper.readTree(json);//json문자열 넣으면 하나씩 쫓을 수 있음

        // 해당 경우는 미리 json의 형태를 다 알고있는 경우 사용 가능
        String name = jsonNode.get("name").asText();
        int age = jsonNode.get("age").asInt();

        //cars의 경우 새로운 배열의 json노드 형태이므로 만들어줘야함
        JsonNode cars_node = jsonNode.get("cars");
        ArrayNode arrayNode = (ArrayNode) cars_node;
        List<Car> _cars = objectMapper.convertValue(arrayNode, new TypeReference<List<Car>>() {
        });
        out.println(_cars);

        ObjectNode objectNode = (ObjectNode) jsonNode;
        objectNode.put("name","nams");
        objectNode.put("age",20);
        System.out.println(objectNode.toPrettyString());
    }
}