package com.mock.spring_boot.services.impl;

import static com.mock.spring_boot.mapper.EventMapper.mapToEvent;
import static com.mock.spring_boot.mapper.EventMapper.mapToEventDto;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.mock.spring_boot.dto.EventDto;
import com.mock.spring_boot.models.Club;
import com.mock.spring_boot.models.Event;
import com.mock.spring_boot.repositories.ClubRepository;
import com.mock.spring_boot.repositories.EventRepository;
import com.mock.spring_boot.services.EventService;

@Service
public class EventServiceImpl implements EventService {

	@Value("${spring.security.user.name}")
	private String adminUsername;
	private EventRepository eventRepository;
	private ClubRepository clubRepository;

	public EventServiceImpl(EventRepository eventRepository, ClubRepository clubRepository) {
		super();
		this.eventRepository = eventRepository;
		this.clubRepository = clubRepository;
	}
	
	@PreAuthorize("isAuthenticated()")
	@Override
	public void createEvent(Long clubId, EventDto eventDto) {
		Club club = clubRepository.findById(clubId).get();
		Event event = mapToEvent(eventDto);
		event.setClub(club);
		
		eventRepository.save(event);
	}
	@PreAuthorize("isAuthenticated()")
	@Override
	public Event saveEvent(EventDto eventDto) {
		return eventRepository.save(mapToEvent(eventDto));
	}

	@Override
	public List<EventDto> findAllEvents() {
		List<EventDto> events = eventRepository.findAll().stream().map(event-> mapToEventDto(event)).toList();
		return events;
	}

	@Override
	public EventDto findEventById(Long eventId) {
		Event event = eventRepository.findById(eventId)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
		return mapToEventDto(event);
	}
	@PreAuthorize("isAuthenticated()")
	@Override
	public void updateEvent(EventDto eventDto) {
		Event event = mapToEvent(eventDto);
		// This is here because the eventDto doesn't have the clubId, so we need to set it before saving the event
		event.setClub(eventRepository.findById(eventDto.getId()).get().getClub());
		event.setCreatedBy(eventRepository.findById(eventDto.getId()).get().getCreatedBy());
		eventRepository.save(event);
	}
	@PreAuthorize("isAuthenticated()")
	@Override
	public void deleteEvent(Long eventId) {
		eventRepository.deleteById(eventId);		
	}

	@Override
	public List<EventDto> searchEvent(String query) {
		return eventRepository.searchEvents(query).stream().map(event-> mapToEventDto(event)).toList();
	}

}
