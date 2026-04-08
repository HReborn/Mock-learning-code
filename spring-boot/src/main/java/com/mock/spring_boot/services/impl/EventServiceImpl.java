package com.mock.spring_boot.services.impl;

import static com.mock.spring_boot.mapper.EventMapper.mapToEvent;
import static com.mock.spring_boot.mapper.EventMapper.mapToEventDto;
import static com.mock.spring_boot.security.SecurityUtil.getSessionUsername;
import static com.mock.spring_boot.security.SecurityUtil.isSuperAdmin;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.mock.spring_boot.dto.EventDto;
import com.mock.spring_boot.dto.EventEditDto;
import com.mock.spring_boot.models.Club;
import com.mock.spring_boot.models.Event;
import com.mock.spring_boot.models.UserEntity;
import com.mock.spring_boot.repositories.ClubRepository;
import com.mock.spring_boot.repositories.EventRepository;
import com.mock.spring_boot.repositories.UserRepository;
import com.mock.spring_boot.services.EventService;
import com.mock.spring_boot.services.UserService;

@Service
public class EventServiceImpl implements EventService {

	private final UserRepository userRepository;
	private EventRepository eventRepository;
	private ClubRepository clubRepository;
	private UserService userService;

	public EventServiceImpl(EventRepository eventRepository, ClubRepository clubRepository, UserService userService, UserRepository userRepository) {
		super();
		this.eventRepository = eventRepository;
		this.clubRepository = clubRepository;
		this.userService = userService;
		this.userRepository = userRepository;
	}
	
	@PreAuthorize("isAuthenticated()")
	@Override
	public Event createEvent(Long clubId, EventDto eventDto) {
		Club club = clubRepository.findById(clubId).get();
		UserEntity currentUser = userRepository.findByUsername(getSessionUsername());
		Event mappedEvent = mapToEvent(eventDto);
		// TODO: Implement @Component to avoid code duplication
		
		mappedEvent.setClub(club);
		mappedEvent.setCreatedBy(currentUser);
		mappedEvent.setLastUpdatedBy(currentUser);
		return eventRepository.save(mappedEvent);
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
	public void updateEvent(EventEditDto eventEditDto) {
		UserEntity currentUser = userRepository.findByUsername(getSessionUsername());
		Event event = eventRepository.findById(eventEditDto.getEventId()).get();
		event.setName(eventEditDto.getName());
		event.setType(eventEditDto.getType());
		event.setPhotoURL(eventEditDto.getPhotoURL());
		event.setStartTime(eventEditDto.getStartTime());
		event.setEndTime(eventEditDto.getEndTime());
		// TODO: Implement @Component to avoid code duplication
		event.setLastUpdatedBy(currentUser);
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

	@Override
	public boolean canCurrentUserEditEvent(EventDto eventDto) {
		// This means that the user isn't authenticated
		if (getSessionUsername() == null) {
			return false;
		}
		// This means that the current user is the owner
		if (userService.getCurrentUser().getUsername() == eventDto.getCreatedByUsername()) {
			return true;
		}
		if (isSuperAdmin()) {
			return true;
		}	
		return false;
	}
}
