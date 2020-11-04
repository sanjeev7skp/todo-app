package io.schultz.dustin.todoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoAppApplication {

	public static void main(String[] args) {
		System.out.println("San testing...");
		SpringApplication.run(TodoAppApplication.class, args);
	}

}
