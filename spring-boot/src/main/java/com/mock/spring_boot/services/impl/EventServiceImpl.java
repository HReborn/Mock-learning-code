package com.mock.spring_boot.services.impl;

import static com.mock.spring_boot.mapper.EventMapper.mapToEvent;
import static com.mock.spring_boot.mapper.EventMapper.mapToEventDto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mock.spring_boot.dto.EventDto;
import com.mock.spring_boot.models.Club;
import com.mock.spring_boot.models.Event;
import com.mock.spring_boot.repositories.ClubRepository;
import com.mock.spring_boot.repositories.EventRepository;
import com.mock.spring_boot.services.EventService;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepository eventRepository;
	@Autowired
	private ClubRepository clubRepository;

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
