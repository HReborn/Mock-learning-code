package com.mock.spring_boot.dto;

import java.util.List;

import com.mock.spring_boot.models.Role;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {
	
	private Long id;
	private String email;
	private String username;
	private List<Role> roles;
}