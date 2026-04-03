package com.mock.spring_boot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mock.spring_boot.models.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
	
	@Query("SELECT e from Event e WHERE e.name LIKE CONCAT('%', :query, '%')")
	List<Event> searchEvents(String query);
}