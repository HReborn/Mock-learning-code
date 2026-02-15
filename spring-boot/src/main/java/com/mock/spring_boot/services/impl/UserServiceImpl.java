package com.mock.spring_boot.services.impl;

import org.springframework.stereotype.Service;

import com.mock.spring_boot.dto.RegistrationDto;
import com.mock.spring_boot.models.Role;
import com.mock.spring_boot.models.UserEntity;
import com.mock.spring_boot.repositories.RoleRepository;
import com.mock.spring_boot.repositories.UserRepository;
import com.mock.spring_boot.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	private RoleRepository roleRepository;
	
	public UserServiceImpl(UserRepository userRepository,RoleRepository roleRepository) {
		super();
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
	}

	@Override
	public void registerUser(RegistrationDto registrationDto) {
		UserEntity user = new UserEntity();
		user.setUsername(registrationDto.getUsername());
		user.setEmail(registrationDto.getEmail());
		user.setPassword(registrationDto.getPassword());
		Role role = roleRepository.findByName("USER");
		user.getRoles().add(role);
		userRepository.save(user);
	}

	@Override
	public UserEntity findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public UserEntity findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
}
