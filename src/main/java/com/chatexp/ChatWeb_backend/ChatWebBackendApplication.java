package com.chatexp.ChatWeb_backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatWebBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ChatWebBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello ChatExp!");
	}
}
