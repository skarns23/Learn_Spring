package com.company.design.facade;

public class Writer {

    private String fileName;

    public Writer(String fileName){
        this.fileName = fileName;
    }

    public  void fileConnect(){
        String msg = String.format("Writer %s로 연결합니다.",fileName);
        System.out.println(msg);
    }
    public  void fileDiconnect(){
        String msg = String.format("Writer %s로 연결을 종료합니다.",fileName);
        System.out.println(msg);
    }public  void write(){
        String msg = String.format("Writer %s에 내용을 적습니다.",fileName);
        System.out.println(msg);
    }
}
