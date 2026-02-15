package com.mock.spring_boot.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationDto {
	private Long id;
	@NotEmpty
	private String username;
	@NotEmpty
	private String email;
	@NotEmpty
	private String password;
}
