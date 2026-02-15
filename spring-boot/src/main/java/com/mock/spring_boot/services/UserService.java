package com.mock.spring_boot.services;

import com.mock.spring_boot.dto.RegistrationDto;

public interface UserService {
	void registerUser(RegistrationDto registrationDto);
}
