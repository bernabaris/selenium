package com.github.bernabaris.seleniumsproject;

import org.springframework.stereotype.Component;

@Component
public class Book {
    public Book() {
        System.out.println("com.github.bernabaris Book instantiated");
    }
    public void getCar()  {
        System.out.println("Lord of the Rings");
    }
}
