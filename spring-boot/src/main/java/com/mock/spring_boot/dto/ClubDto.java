package com.mock.spring_boot.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClubDto {
	// A DTO tl;dr is when you want to hide certain fields from the client/user. Like a password.
	private Long id;
	private String title;
	private String photoURL;
	private String content;
	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;

}
