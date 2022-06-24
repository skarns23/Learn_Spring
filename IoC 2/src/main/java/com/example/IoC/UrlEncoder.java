package com.example.IoC;

import org.springframework.stereotype.Component;

import java.net.URLEncoder;

@Component
public class UrlEncoder implements iEncoder{
    @Override
    public String encode(String msg){
        try {
            return URLEncoder.encode(msg, "UTF-8");
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
        }
}
