package com.mock.spring_boot.services.impl;

import static com.mock.spring_boot.mapper.UserMapper.mapToUserDto;
import static com.mock.spring_boot.security.SecurityUtil.getSessionUsername;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.mock.spring_boot.dto.ChangePasswordDto;
import com.mock.spring_boot.dto.RegistrationDto;
import com.mock.spring_boot.dto.UserDto;
import com.mock.spring_boot.models.Role;
import com.mock.spring_boot.models.UserEntity;
import com.mock.spring_boot.repositories.RoleRepository;
import com.mock.spring_boot.repositories.UserRepository;
import com.mock.spring_boot.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	private RoleRepository roleRepository;
	private PasswordEncoder passwordEncoder;
	
	public UserServiceImpl(UserRepository userRepository,RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
		super();
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public UserEntity registerUser(RegistrationDto registrationDto) {
		UserEntity user = new UserEntity();
		user.setUsername(registrationDto.getUsername());
		user.setEmail(registrationDto.getEmail());
		user.setPassword(passwordEncoder.encode(registrationDto.getPassword()));
		Role role = roleRepository.findByName("USER");
		user.getRoles().add(role);
		return userRepository.save(user);
	}
	
	// Even though it is duplicated, i think it would be better to have a separate method for registering super admin
	// to track any possible shady stuff.

	@Override
	public UserDto findByEmail(String email) {
		return mapToUserDto(userRepository.findByEmail(email));
	}

	@Override
	public UserDto findByUsername(String username) {
		System.out.println("Finding user by username: " + username);
		return mapToUserDto(userRepository.findByUsername(username));
	}

	@Override
	public void alterPassword(ChangePasswordDto changePasswordDto) {
		UserEntity currentUser = userRepository.findByUsername(getSessionUsername());
		String currentPassword = passwordEncoder.encode(changePasswordDto.getCurrentPassword());
		String newPassword = passwordEncoder.encode(changePasswordDto.getNewPassword());
		if (passwordEncoder.matches(currentPassword, currentUser.getPassword())) {
			currentUser.setPassword(newPassword);
		}
		// The .save() from jparepository will only create a new user if the id is null.
		userRepository.save(currentUser);
	}

	@Override
	public void updateUser(UserEntity user) {
		userRepository.save(user);
	}
}
