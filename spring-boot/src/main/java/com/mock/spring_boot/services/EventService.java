package com.mock.spring_boot.services;

import com.mock.spring_boot.dto.EventDto;

public interface EventService {
	
	void createEvent(Long clubId, EventDto eventDto);

}
