package com.example.IoC;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Encoder {

    private iEncoder iEncoder;

    public Encoder ( iEncoder iEncoder){
        this.iEncoder = iEncoder;
    }
    public void setiEncoder(iEncoder iEncoder){
        this.iEncoder = iEncoder;
    }
    public String encode(String msg){
        return iEncoder.encode(msg);
    }
}
