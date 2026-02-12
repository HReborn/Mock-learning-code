package com.mock.spring_boot.services;

import java.util.List;

import com.mock.spring_boot.dto.EventDto;
import com.mock.spring_boot.models.Event;

public interface EventService {
	
	void createEvent(Long clubId, EventDto eventDto);
	Event saveEvent(EventDto eventDto);
	List<EventDto> findAllEvents();
	EventDto findEventById(Long eventId);
	void updateEvent(EventDto eventDto);

}