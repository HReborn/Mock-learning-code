package com.mock.spring_boot.services;

import java.util.List;

import com.mock.spring_boot.dto.ClubDto;
import com.mock.spring_boot.models.Club;

public interface ClubService {
	List<ClubDto> findAllClubs();
	Club saveClub(ClubDto clubDto);
	ClubDto findById(Long id);
	void updateClub(ClubDto club);
	void deleteClub(Long id);
	List<ClubDto> searchClubs(String query);
	boolean canCurrentUserEditClub(ClubDto clubDto);
}