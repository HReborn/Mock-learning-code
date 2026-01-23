package com.mock.spring_boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mock.spring_boot.models.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
	
}
