package com.mock.spring_boot.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.mock.spring_boot.dto.EventDto;
import com.mock.spring_boot.models.Club;
import com.mock.spring_boot.models.Event;
import com.mock.spring_boot.repositories.ClubRepository;
import com.mock.spring_boot.repositories.EventRepository;
import com.mock.spring_boot.services.EventService;

public class EventServiceImpl implements EventService {

	private EventRepository eventRepository;	
	private ClubRepository clubRepository;

	@Autowired
	public EventServiceImpl(EventRepository eventRepository, ClubRepository clubRepository) {
		super();
		this.eventRepository = eventRepository;
		this.clubRepository = clubRepository;
	}

	@Override
	public void createEvent(Long clubId, EventDto eventDto) {
		Club club = clubRepository.findById(clubId).get();
		Event event = mapToEvent(eventDto);
		event.setClub(club);
		eventRepository.save(event);
	}
	
	private Event mapToEvent(EventDto eventDto) {
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
