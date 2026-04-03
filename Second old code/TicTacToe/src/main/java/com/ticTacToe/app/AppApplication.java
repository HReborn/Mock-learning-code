package com.tictactoe.app;

import java.util.NoSuchElementException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(UserRepository repository) {
		return args -> {
			Users users = new Users();
			users.setName("Reborn");
			users.setDraws(0);
			users.setLosses(0);
			users.setWins(0);
			repository.save(users);
			Users saved = repository.findById(users.getId()).orElseThrow(NoSuchElementException::new);
			System.out.println(saved);
		};
	}
}