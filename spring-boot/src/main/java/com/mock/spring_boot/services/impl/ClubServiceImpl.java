package com.mock.spring_boot.services.impl;

import static com.mock.spring_boot.mapper.ClubMapper.mapToClub;
import static com.mock.spring_boot.mapper.ClubMapper.mapToClubDto;
import static com.mock.spring_boot.security.SecurityUtil.getSessionUsername;
import static com.mock.spring_boot.security.SecurityUtil.isSuperAdmin;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.mock.spring_boot.dto.ClubDto;
import com.mock.spring_boot.models.Club;
import com.mock.spring_boot.repositories.ClubRepository;
import com.mock.spring_boot.services.ClubService;
import com.mock.spring_boot.services.UserService;

@Service
public class ClubServiceImpl implements ClubService {

	private ClubRepository clubRepository;
	private UserService userService; 
	
	public ClubServiceImpl(ClubRepository clubRepository, UserService userService) {
		super();
		this.userService = userService;
		this.clubRepository = clubRepository;
	}
	
	@Override
	public List<ClubDto> findAllClubs() {
		List<Club> clubs =  clubRepository.findAll();
		List<ClubDto> clubDtos = clubs.stream().map(club -> mapToClubDto(club)).toList(); 
		return clubDtos;
	}

	@Override
	@PreAuthorize("isAuthenticated()")
	public Club saveClub(ClubDto clubDto) {
		Club club = mapToClub(clubDto);
		return clubRepository.save(club);
	}

	@Override
	public ClubDto findById(Long id) {
		Club club = clubRepository.findById(id)
				.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
		
		ClubDto clubDto = mapToClubDto(club);
		return clubDto;
	}

	@Override
	@PreAuthorize("isAuthenticated()")
	public void updateClub(ClubDto club) {
		clubRepository.save(mapToClub(club));
	}

	@Override
	@PreAuthorize("isAuthenticated()")
	public void deleteClub(Long id) {
		clubRepository.deleteById(id);
	}

	@Override
	public List<ClubDto> searchClubs(String query) {
		return clubRepository.searchClubs(query).stream().map((club) -> mapToClubDto(club)).collect(Collectors.toList());
	}

	@Override
	public boolean canCurrentUserEditClub(ClubDto clubDto) {
		// This means that the user isn't authenticated
		if (getSessionUsername() == null) {
			return false;
		}
		// This means that the current user is the owner
		if (userService.getCurrentUser().getId() == clubDto.getCreatedBy().getId()) {
			return true;
		}
		if (isSuperAdmin()) {
			return true;
		}	
		return false;
	}
}
