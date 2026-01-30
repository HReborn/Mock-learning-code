package com.mock.spring_boot.dto;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.mock.spring_boot.models.Club;

import groovy.transform.builder.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventDto {
	private Long id;
	private String name;
	@DateTimeFormat(pattern = "yyy-MM-dd'T'HH:mm")
	private LocalDateTime startTime;
	@DateTimeFormat(pattern = "yyy-MM-dd'T'HH:mm")
	private LocalDateTime endTime;
	private String type;
	private String photoURL;
	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;
	private Club club;
}
