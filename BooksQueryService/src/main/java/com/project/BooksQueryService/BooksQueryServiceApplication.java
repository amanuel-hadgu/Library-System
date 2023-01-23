package com.project.BooksQueryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class BooksQueryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksQueryServiceApplication.class, args);
	}

}
