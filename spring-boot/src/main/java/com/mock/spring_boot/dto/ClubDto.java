package com.mock.spring_boot.dto;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClubDto {
	// A DTO tl;dr is when you want to hide certain fields from the client/user. Like a password.
	private Long id;
	@NotEmpty(message = "O título não pode ser vazio, paizão.")
	private String title;
	@NotEmpty(message = "A URL não pode ser vazio, paizão.")
	private String photoURL;
	@NotEmpty(message = "O conteúdo não pode ser vazio, paizão.")
	private String content;
	@DateTimeFormat(pattern = "yyy-MM-dd'T'HH:mm")
	private LocalDateTime createdOn;
	@DateTimeFormat(pattern = "yyy-MM-dd'T'HH:mm")
	private LocalDateTime updatedOn;
	private UserDto createdBy;
	private UserDto lastUpdatedBy;
	//This field can be empty if the clubMapper is called from the eventMapper to avoid an infinite loop.
	private List<EventDto> events;
}
