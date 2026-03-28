package com.mock.spring_boot.services.impl;

import static com.mock.spring_boot.mapper.ClubMapper.mapToClub;
import static com.mock.spring_boot.mapper.ClubMapper.mapToClubDto;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.mock.spring_boot.dto.ClubDto;
import com.mock.spring_boot.models.Club;
import com.mock.spring_boot.repositories.ClubRepository;
import com.mock.spring_boot.services.ClubService;

@Service
public class ClubServiceImpl implements ClubService {

	@Value("${spring.security.user.name}")
	private String adminUsername;
	private ClubRepository clubRepository;
	
	public ClubServiceImpl(ClubRepository clubRepository) {
		super();
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
}
