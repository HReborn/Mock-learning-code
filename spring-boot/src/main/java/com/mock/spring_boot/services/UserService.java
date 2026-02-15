package com.mock.spring_boot.services;

import com.mock.spring_boot.dto.RegistrationDto;
import com.mock.spring_boot.models.UserEntity;

public interface UserService {
	void registerUser(RegistrationDto registrationDto);

	UserEntity findByEmail(String email);
	UserEntity findByUsername(String username);
}
