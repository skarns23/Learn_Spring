package com.example.IoC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class IoCApplication {

	public static void main(String[] args) {
		SpringApplication.run(IoCApplication.class, args);

		ApplicationContext context = ApplicationContextProvider.getContext();

		Encoder encoder = context.getBean("urlEncode",Encoder.class);

		String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";
		String result = encoder.encode(url);
		System.out.println(result);

	}

}


@Configuration // 하나의 클래스에서 여러 개의 빈을 등록할 때 사용
class AppConfig{
	@Bean("base64Encode")
	public Encoder encoder(Base64Encoder base64Encoder){
		return new Encoder(base64Encoder);
	}

	@Bean("urlEncode")
	public Encoder encoder(UrlEncoder urlEncoder){
		return new Encoder(urlEncoder);
	}
}
