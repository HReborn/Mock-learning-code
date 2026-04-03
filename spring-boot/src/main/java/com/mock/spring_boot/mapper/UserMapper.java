package com.mock.spring_boot.mapper;

import com.mock.spring_boot.dto.UserDto;
import com.mock.spring_boot.models.UserEntity;

public class UserMapper {
		
	public static UserDto mapToUserDto(UserEntity user) {
		return UserDto.builder()
				.id(user.getId())
				.email(user.getEmail())
				.username(user.getUsername())
				.createdOn(user.getCreatedOn())
				.updatedOn(user.getUpdatedOn())
				.roles(user.getRoles()).build();
	}
	
	public static UserEntity mapToUserEntity(UserDto userDto) {
		return UserEntity.builder()
				.id(userDto.getId())
				.email(userDto.getEmail())
				.username(userDto.getUsername())
				.createdOn(userDto.getCreatedOn())
				.updatedOn(userDto.getUpdatedOn())
				.roles(userDto.getRoles()).build();
	}
}