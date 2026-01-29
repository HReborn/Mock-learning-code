package com.mock.spring_boot.services;

import com.mock.spring_boot.dto.EventDto;
import com.mock.spring_boot.models.Event;

public interface EventService {
	
	void createEvent(Long clubId, EventDto eventDto);
	Event saveEvent(EventDto eventDto);

}