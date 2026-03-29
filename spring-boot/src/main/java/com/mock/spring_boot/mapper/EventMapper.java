package com.mock.spring_boot.mapper;

import static com.mock.spring_boot.mapper.ClubMapper.*;
import static com.mock.spring_boot.mapper.UserMapper.*;

import com.mock.spring_boot.dto.EventDto;
import com.mock.spring_boot.models.Event;
import static com.mock.spring_boot.mapper.UserMapper.mapToUserDto;
import static com.mock.spring_boot.mapper.UserMapper.mapToUserEntity;

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
				.club(mapToClub(eventDto.getClub()))
				.createdBy(mapToUserEntity(eventDto.getCreatedBy()))
				.lastUpdatedBy(mapToUserEntity(eventDto.getLastUpdatedBy()))
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
				.club(mapToClubDtoWithoutEvents(event.getClub()))
				.createdBy(mapToUserDto(event.getCreatedBy()))
				.lastUpdatedBy(mapToUserDto(event.getLastUpdatedBy()))
				.build();
	}
	
	public static Event mapToEventWhileCreatingEvent(EventDto eventDto) {
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
}