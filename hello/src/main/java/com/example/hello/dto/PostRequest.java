package com.example.hello.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRequest {

    private String account;
    private String email;
    private String address;
    private String password;


    @JsonProperty("phone_number") //JsonProperty 어노테이션은 이름을 지정하면 매칭시켜준다.
    private String phoneNumber; //phone_number snake case에 대해서는 null값을 받음 처리할 수 있어야한다.
    //Object Mapper를 활용하면 할 수 있다.

    @JsonProperty("OTP") //특정 값을 매칭시키고 싶은경우 활용
    private String OTP;

    public String getOTP() {
        return OTP;
    }

    public void setOTP(String OTP) {
        this.OTP = OTP;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "PostRequest{" +
                "account='" + account + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", OTP='" + OTP + '\'' +
                '}';
    }
}
