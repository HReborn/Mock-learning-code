package com.mock.spring_boot.dto;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EventEditDto {
	private Long eventId;
	private String name;
	@DateTimeFormat(pattern = "yyy-MM-dd'T'HH:mm")
	private LocalDateTime startTime;
	@DateTimeFormat(pattern = "yyy-MM-dd'T'HH:mm")
	private LocalDateTime endTime;
	private String type;
	private String photoURL;
}