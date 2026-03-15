package com.mock.spring_boot.services.impl;

import static com.mock.spring_boot.mapper.EventMapper.mapToEvent;
import static com.mock.spring_boot.mapper.EventMapper.mapToEventDto;
import static com.mock.spring_boot.security.SecurityUtil.getSessionUsername;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mock.spring_boot.dto.EventDto;
import com.mock.spring_boot.models.Club;
import com.mock.spring_boot.models.Event;
import com.mock.spring_boot.models.UserEntity;
import com.mock.spring_boot.repositories.ClubRepository;
import com.mock.spring_boot.repositories.EventRepository;
import com.mock.spring_boot.repositories.UserRepository;
import com.mock.spring_boot.services.EventService;

@Service
public class EventServiceImpl implements EventService {

	private EventRepository eventRepository;
	private ClubRepository clubRepository;
	private UserRepository userRepository;
	private String sessionUsername = getSessionUsername();
	private UserEntity sessionUser = sessionUsername != null ? userRepository.findByUsername(sessionUsername) : null;

	public EventServiceImpl(EventRepository eventRepository, ClubRepository clubRepository, UserRepository userRepository) {
		super();
		this.eventRepository = eventRepository;
		this.clubRepository = clubRepository;
		this.userRepository = userRepository;
	}

	@Override
	public void createEvent(Long clubId, EventDto eventDto) {
		Club club = clubRepository.findById(clubId).get();
		Event event = mapToEvent(eventDto);
		event.setClub(club);
		event.setCreatedBy(sessionUser);
		eventRepository.save(event);
	}

	@Override
	public Event saveEvent(EventDto eventDto) {
		return eventRepository.save(mapToEvent(eventDto));
	}

	@Override
	public List<EventDto> findAllEvents() {
		return eventRepository.findAll().stream().map(event-> mapToEventDto(event)).toList();
	}

	@Override
	public EventDto findEventById(Long eventId) {
		return mapToEventDto(eventRepository.findById(eventId).get());
	}

	@Override
	public void updateEvent(EventDto eventDto) {
		Event event = mapToEvent(eventDto);
		// This is here because the eventDto doesn't have the clubId, so we need to set it before saving the event
		event.setClub(eventRepository.findById(eventDto.getId()).get().getClub());
		event.setCreatedBy(eventRepository.findById(eventDto.getId()).get().getCreatedBy());
		eventRepository.save(event);
	}

	@Override
	public void deleteEvent(Long eventId) {
		eventRepository.deleteById(eventId);		
	}

	@Override
	public List<EventDto> searchEvent(String query) {
		return eventRepository.searchEvents(query).stream().map(event-> mapToEventDto(event)).toList();
	}

}
