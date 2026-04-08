package com.mock.spring_boot.services;

import java.util.List;

import com.mock.spring_boot.dto.EventDto;
import com.mock.spring_boot.dto.EventEditDto;
import com.mock.spring_boot.models.Event;

public interface EventService {
	
	Event createEvent(Long clubId, EventDto eventDto);
	List<EventDto> findAllEvents();
	EventDto findEventById(Long eventId);
	void updateEvent(EventEditDto eventDto);
	void deleteEvent(Long eventId);
	List<EventDto> searchEvent(String query);
	boolean canCurrentUserEditEvent(EventDto eventDto);

}