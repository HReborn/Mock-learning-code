package com.mock.spring_boot.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
	
	private CustomUserDetailsService userDetailsService;
	private AdminUserDetailsService adminUserDetailsService;
	
	public SecurityConfig(CustomUserDetailsService userDetailsService, AdminUserDetailsService adminUserDetailsService) {
		super();
		this.userDetailsService = userDetailsService;
		this.adminUserDetailsService = adminUserDetailsService;
	}

	// We'll bring a decoder to avoid storing passwords in plain text.
	@Bean
	static PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
    DaoAuthenticationProvider adminAuthenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider(adminUserDetailsService);
        authProvider.setPasswordEncoder(passwordEncoder());
        System.out.println("Admin authentication provider created with admin username");
        return authProvider;
    }
	
	@Bean
    DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider(userDetailsService);
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		// gonna disable because it's not production. For simplicity's sake.
		http.csrf(csrf -> csrf.disable())
			.authorizeHttpRequests(auth -> auth
					.requestMatchers("/login", "/register", "/register/save", "/clubs", "/css/**", "/js/**", "/", "/clubs", "/events").permitAll()
					.anyRequest().authenticated()
			)
			// This line allows anyone to access the login, register, clubs, css, and js endpoints without authentication. You can adjust this 
			// as needed for your application. Gotta permit js and css because otherwise, the login and register pages won't be styled and 
			// won't work properly.
			.formLogin(form -> form
					.loginPage("/login")
					.defaultSuccessUrl("/clubs")
					.loginProcessingUrl("/login/auth")
					.failureUrl("/login?error=true")
					.permitAll()
			).logout(logout -> logout
					.logoutSuccessUrl("/login?logout=true")
			).authenticationProvider(adminAuthenticationProvider()
			).authenticationProvider(authenticationProvider());
		return http.build();
	}
}
