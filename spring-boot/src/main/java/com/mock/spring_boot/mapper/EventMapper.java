package com.mock.spring_boot.mapper;

import com.mock.spring_boot.dto.EventDto;
import com.mock.spring_boot.models.Event;

public class EventMapper {
	
	public static Event mapToEvent(EventDto eventDto) {
		return Event.builder()
				.id(eventDto.getId())
				.name(eventDto.getName())
				.startTime(eventDto.getStartTime())
				.endTime(eventDto.getEndTime())
				.type(eventDto.getType())
				.photoURL(eventDto.getPhotoURL())
				.createdOn(eventDto.getCreatedOn())
				.updatedOn(eventDto.getUpdatedOn())
				.build();
	}
	
	public static EventDto mapToEventDto(Event event) {
		return EventDto.builder()
				.id(event.getId())
				.name(event.getName())
				.startTime(event.getStartTime())
				.endTime(event.getEndTime())
				.type(event.getType())
				.photoURL(event.getPhotoURL())
				.createdOn(event.getCreatedOn())
				.updatedOn(event.getUpdatedOn())
				.build();
	}
}