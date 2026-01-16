package com.mock.spring_boot.services;

import java.util.List;

import com.mock.spring_boot.dto.ClubDto;
import com.mock.spring_boot.models.Club;

public interface ClubService {
	List<ClubDto> findAllClubs();
	Club saveClub(Club club);
}
