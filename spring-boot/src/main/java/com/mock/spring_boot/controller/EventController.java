package com.mock.spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mock.spring_boot.models.Event;
import com.mock.spring_boot.services.EventService;

@Controller
public class EventController {
	
	public EventService eventService;

	@Autowired
	public EventController(EventService eventService) {
		super();
		this.eventService = eventService;
	}
	
	@GetMapping("/clubs/{clubId}/new")
	public String createEvent(@PathVariable("clubId") Long clubId, Model model ) {
		Event event = new Event();
		model.addAttribute("clubId", clubId);
		model.addAttribute("event", event);
		return "events-create";
	}
}
