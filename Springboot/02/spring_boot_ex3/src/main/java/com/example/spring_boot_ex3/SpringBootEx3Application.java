package com.example.spring_boot_ex3;

import org.springframework.context.ApplicationContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootEx3Application {

	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}

	public static void main(String[] args) {
	ApplicationContext context  = SpringApplication.run(SpringBootEx3Application.class, args);
	HelloWorld helloWorld = context.getBean(HelloWorld.class);
	System.out.println(helloWorld.helloWorld());
	
	}

}
