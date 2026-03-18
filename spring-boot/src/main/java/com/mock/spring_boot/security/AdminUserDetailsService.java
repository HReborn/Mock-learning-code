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

import com.mock.spring_boot.dto.RegistrationDto;
import com.mock.spring_boot.models.UserEntity;
import com.mock.spring_boot.services.UserService;

@Service
public class AdminUserDetailsService implements UserDetailsService {
		
	@Value("${spring.security.user.name}")
	private String superAdminUsername;
	@Value("${spring.security.user.password}")
	private String adminPassword;
	@Value("${spring.security.user.email}")
	private String adminEmail;
	private UserService userService;
	private static PasswordEncoder passwordEncoder = passwordEncoder();

	public AdminUserDetailsService(UserService userService) {
		super();
		this.userService = userService;
	}
	
	private UserEntity registerSuperAdminUser() {
		RegistrationDto adminUser = new RegistrationDto();
		adminUser.setUsername(superAdminUsername);
		adminUser.setPassword(passwordEncoder.encode(adminPassword));
		adminUser.setEmail(adminEmail);
		return userService.registerSuperAdminUser(adminUser);
	}
	
	private void alterSuperAdminPassword(UserEntity adminUser) {
		adminUser.setPassword(passwordEncoder.encode(adminPassword));
		userService.updateUser(adminUser);
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity adminUser = userService.findByUsername(superAdminUsername);
		// You need to register admin in the database because you gonna need to check the created by club.
		// If there isn't an admin in the database, you won't be able to create a club because the created by club is admin.
		if (adminUser == null) {
			adminUser = registerSuperAdminUser();
		}
		// Formality's sake. The admin password will be determined by the application-admin.properties
		if (adminUser.getPassword() != passwordEncoder.encode(adminPassword)) {
			alterSuperAdminPassword(adminUser);
		}
		if (!username.equals(superAdminUsername)) {
	        throw new UsernameNotFoundException("Not admin user");
	    }
		System.out.println("Admin user found: " + username);
	    return new User(
	        superAdminUsername,
	        // If you do not encode the password, Spring Security will not be able to authenticate the admin user.
	        // This happens because Spring Security expects the password to be encoded when it compares it to the password provided during login.
	        passwordEncoder.encode(adminPassword),
	        Arrays.asList(new SimpleGrantedAuthority("SUPER_ADMIN"))
	    );
	}
}