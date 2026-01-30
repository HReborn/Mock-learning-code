package com.mock.spring_boot.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mock.spring_boot.dto.ClubDto;
import com.mock.spring_boot.models.Club;
import com.mock.spring_boot.repositories.ClubRepository;
import com.mock.spring_boot.services.ClubService;

import static com.mock.spring_boot.mapper.ClubMapper.mapToClub;
import static com.mock.spring_boot.mapper.ClubMapper.mapToClubDto;

@Service
public class ClubServiceImpl implements ClubService {

	@Autowired
	private ClubRepository clubRepository;
	
	public ClubServiceImpl(ClubRepository clubRepository) {
		super();
		this.clubRepository = clubRepository;
	}

	@Override
	public List<ClubDto> findAllClubs() {
		List<Club> clubs =  clubRepository.findAll();
		return clubs.stream().map((club) -> mapToClubDto(club)).collect(Collectors.toList());
	}

	@Override
	public Club saveClub(ClubDto clubDto) {
		Club club = mapToClub(clubDto);
		return clubRepository.save(club);
	}

	@Override
	public ClubDto findById(Long id) {
		Optional<Club> club = clubRepository.findById(id);
		ClubDto clubDto = mapToClubDto(club.get());
		return clubDto;
	}

	@Override
	public void updateClub(ClubDto club) {
		clubRepository.save(mapToClub(club));
	}

	@Override
	public void deleteClub(Long id) {
		clubRepository.deleteById(id);
	}

	@Override
	public List<ClubDto> searchClubs(String query) {
		return clubRepository.searchClubs(query).stream().map((club) -> mapToClubDto(club)).collect(Collectors.toList());
	}
}
