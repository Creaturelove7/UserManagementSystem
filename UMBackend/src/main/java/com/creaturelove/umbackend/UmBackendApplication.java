package com.creaturelove.umbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.creaturelove.umbackend.mapper")
public class UmBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmBackendApplication.class, args);
	}

}
