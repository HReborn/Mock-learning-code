package com.mock.spring_boot.security;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mock.spring_boot.models.UserEntity;
import com.mock.spring_boot.repositories.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	private UserRepository userRepository;

	public CustomUserDetailsService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity user = userRepository.findByUsername(username);
		
		
		if (user != null) {
			User authUser = new User(
					user.getUsername(),
					user.getPassword(),
					// This line converts the user's roles into a list of SimpleGrantedAuthority
					// It's a mapper string that'll handle the authorization of features
					// Instead of pulling the role from DB, we do it on login and pass the roles to Spring
					// So this line here is telling Spring Security what roles the user has
					// So that Spring will always check the roles when we ask.
					user.getRoles().stream().map(role -> new SimpleGrantedAuthority(role.getName())).toList()
			);
			
			return authUser;
		} else { 
			throw new UsernameNotFoundException("Invalid username or password."); 
		}
	}
}
