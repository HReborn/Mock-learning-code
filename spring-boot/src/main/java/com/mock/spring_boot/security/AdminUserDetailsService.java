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

import com.mock.spring_boot.models.Role;
import com.mock.spring_boot.models.UserEntity;
import com.mock.spring_boot.repositories.RoleRepository;
import com.mock.spring_boot.repositories.UserRepository;

@Service
public class AdminUserDetailsService implements UserDetailsService {
		
	@Value("${spring.security.user.name}")
	private String superAdminUsername;
	@Value("${spring.security.user.password}")
	private String superAdminPassword;
	@Value("${spring.security.user.email}")
	private String superAdminEmail;
	private UserRepository userRepository;
	private RoleRepository roleRepository;
	private static PasswordEncoder passwordEncoder = passwordEncoder();

	public AdminUserDetailsService(UserRepository userRepository, RoleRepository roleRepository) {
		super();
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if (!username.equals(superAdminUsername)) {
	        throw new UsernameNotFoundException("Not admin user");
	    }
		ifNeededUpdateAdminUserInsideDatabase();
	    return new User(
	        superAdminUsername,
	        // If you do not encode the password, Spring Security will not be able to authenticate the admin user.
	        // This happens because Spring Security expects the password to be encoded when it compares it to the password provided during login.
	        passwordEncoder.encode(superAdminPassword),
	        Arrays.asList(new SimpleGrantedAuthority("SUPER_ADMIN"))
	    );
	}
	
	private UserEntity ifNeededUpdateAdminUserInsideDatabase() {
		UserEntity superAdminUser = userRepository.findByUsername(superAdminUsername);
		boolean isPropertiesAdminCredentialsEqualToDatabase = 
				superAdminUser != null ?
						passwordEncoder.matches(superAdminPassword, superAdminUser.getPassword()) &&
						superAdminUser.getEmail().equals(superAdminEmail) &&
						superAdminUser.getUsername().equals(superAdminUsername)
				:true;
		// null -> true !true
		// not null but equal -> false !true (only one i don't wanna save)
		// not null but diff -> false !false
		if (superAdminUser == null || !isPropertiesAdminCredentialsEqualToDatabase) {
			return updateAdminUser();
		} 
		return null;
	}
	
	private UserEntity updateAdminUser() {
		UserEntity user = new UserEntity();
		user.setUsername(superAdminUsername);
		user.setEmail(superAdminEmail);
		user.setPassword(passwordEncoder.encode(superAdminPassword));
		Role role = roleRepository.findByName("SUPER_ADMIN");
		user.getRoles().add(role);
		return userRepository.save(user);
	}
}