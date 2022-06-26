package org.example.AOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Base64;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
		String url = "skarns23@naver.com";
		System.out.println(Base64.getEncoder().encodeToString(url.getBytes()));
	}

}
