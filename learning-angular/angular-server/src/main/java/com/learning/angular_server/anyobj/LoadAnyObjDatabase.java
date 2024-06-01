package com.learning.angular_server.anyobj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadAnyObjDatabase {
	private static final Logger log =
			LoggerFactory.getLogger(LoadAnyObjDatabase.class);
	
	@Bean
	CommandLineRunner initDatabase(AnyObjRepository repo) {
		
		return args -> {
			log.info("Preloading " + repo.save(new AnyObj("Any1")));
			log.info("Preloading " + repo.save(new AnyObj("Any2")));
		};
	}
}