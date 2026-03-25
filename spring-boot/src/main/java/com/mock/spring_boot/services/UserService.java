package com.mock.spring_boot.services;

import com.mock.spring_boot.dto.ChangePasswordDto;
import com.mock.spring_boot.dto.RegistrationDto;
import com.mock.spring_boot.dto.UserDto;
import com.mock.spring_boot.models.UserEntity;

public interface UserService {
	UserEntity registerUser(RegistrationDto registrationDto);
	UserDto findByEmail(String email);
	UserDto findByUsername(String username);
	void alterPassword(ChangePasswordDto changePasswordDto);
	void alterEmail(UserDto user);
	void updateUser(UserDto user);
	void deleteUser(Long userId);
}