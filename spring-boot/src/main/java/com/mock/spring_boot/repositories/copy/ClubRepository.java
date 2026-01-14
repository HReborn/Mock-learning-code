package com.mock.spring_boot.repositories.copy;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mock.spring_boot.models.Club;

public interface ClubRepository extends JpaRepository<Club, Long> {
	Optional<Club> findByTitle(String url);

}
