package com.mock.spring_boot.security;

import static com.mock.spring_boot.security.SecurityConfig.passwordEncoder;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminUserDetailsService implements UserDetailsService {
		
	@Value("${spring.security.user.name}")
	private String adminUsername;
	@Value("${spring.security.user.password}")
	private String adminPassword;
	private static PasswordEncoder passwordEncoder = passwordEncoder();

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if (!username.equals(adminUsername)) {
			System.out.println("Admin username not found: " + username);
	        throw new UsernameNotFoundException("Not admin user");
	    }
		System.out.println("Admin user found: " + username);
	    return new User(
	        adminUsername,
	        // If you do not encode the password, Spring Security will not be able to authenticate the admin user.
	        // This happens because Spring Security expects the password to be encoded when it compares it to the password provided during login.
	        passwordEncoder.encode(adminPassword),
	        Arrays.asList(new SimpleGrantedAuthority("SUPER_ADMIN"))
	    );
	}
}