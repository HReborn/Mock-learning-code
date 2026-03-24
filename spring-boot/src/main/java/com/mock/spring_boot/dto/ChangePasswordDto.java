package com.mock.spring_boot.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChangePasswordDto {

	private String currentPassword;
	private String newPassword;
}
