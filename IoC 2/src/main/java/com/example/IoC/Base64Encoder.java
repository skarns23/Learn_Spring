package com.example.IoC;

import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
public class Base64Encoder implements iEncoder{
    @Override
    public String encode(String msg){
        return Base64.getEncoder().encodeToString(msg.getBytes());
    }
}
