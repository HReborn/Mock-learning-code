package com.mock.spring_boot.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		// gonna disable because it's not production. For simplicity's sake.
		http.csrf(csrf -> csrf.disable())
			.authorizeHttpRequests(auth -> auth
					.requestMatchers("/login", "/register", "/clubs", "/css/**", "/js/**").permitAll()
					.anyRequest().authenticated()
			)
			// This line allows anyone to access the login, register, clubs, css, and js endpoints without authentication. You can adjust this as needed for your application.
			// Gotta permit js and css because otherwise, the login and register pages won't be styled and won't work properly.
			.formLogin(form -> form
					.loginPage("/login")
					.defaultSuccessUrl("/clubs")
					.loginProcessingUrl("/login/auth")
					.failureUrl("/login?error=true")
					.permitAll()
			).logout(logout -> logout
					.logoutSuccessUrl("/login?logout=true")
			);
		return http.build();
	}
}
