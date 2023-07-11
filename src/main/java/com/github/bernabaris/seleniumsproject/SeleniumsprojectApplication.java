package com.github.bernabaris.seleniumsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SeleniumsprojectApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SeleniumsprojectApplication.class, args);
		var book = context.getBean(Book.class);
		book.getCar();
	}

}
