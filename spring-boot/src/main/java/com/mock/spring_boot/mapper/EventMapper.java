package com.mock.spring_boot.mapper;

import com.mock.spring_boot.dto.EventDto;
import com.mock.spring_boot.models.Club;
import com.mock.spring_boot.models.Event;
import com.mock.spring_boot.services.ClubService;
import com.mock.spring_boot.services.EventService;

import static com.mock.spring_boot.mapper.ClubMapper.mapToClub;
import static com.mock.spring_boot.mapper.ClubMapper.mapToClubDto;

import org.springframework.beans.factory.annotation.Autowired;

public class EventMapper {
	
	public static Event mapToEvent(EventDto eventDto, ClubService clubService) {
		return Event.builder()
				.id(eventDto.getId())
				.name(eventDto.getName())
				.startTime(eventDto.getStartTime())
				.endTime(eventDto.getEndTime())
				.type(eventDto.getType())
				.photoURL(eventDto.getPhotoURL())
				.createdOn(eventDto.getCreatedOn())
				.updatedOn(eventDto.getUpdatedOn())
				.club(eventDto.getClubId() != null ? clubService.findById(eventDto.getClubId()) : null)
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
				.clubDto(mapToClubDto(event.getClub()))
				.build();
	}
}