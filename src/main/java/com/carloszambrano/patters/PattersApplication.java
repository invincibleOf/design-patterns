package com.carloszambrano.patters;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PattersApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PattersApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");
	}
}
