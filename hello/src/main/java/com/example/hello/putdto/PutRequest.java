package com.example.hello.putdto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;



@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
//JsoNaming 어노테이션의 경우 모든 key값에 대한 케이스를 매칭시킬 수 있는 어노테이션, 현재는 PropertyNamingStraegies에서 사용가능함
public class PutRequest {


    private String name;
    private int age;
    private List<CarDto> carList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PutRequest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", carList=" + carList +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<CarDto> getCarList() {
        return carList;
    }

    public void setCarList(List<CarDto> carList) {
        this.carList = carList;
    }
}
