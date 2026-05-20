package com.mock.spring_boot.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClubEditDto {
	
	private Long clubId;
	@NotEmpty(message = "O título não pode ser vazio, paizão.")
	private String title;
	@NotEmpty(message = "A URL não pode ser vazio, paizão.")
	private String photoURL;
	@NotEmpty(message = "O conteúdo não pode ser vazio, paizão.")
	private String content;
}
