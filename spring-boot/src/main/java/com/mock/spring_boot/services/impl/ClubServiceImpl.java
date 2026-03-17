package com.mock.spring_boot.services.impl;

import static com.mock.spring_boot.mapper.ClubMapper.mapToClub;
import static com.mock.spring_boot.mapper.ClubMapper.mapToClubDto;
import static com.mock.spring_boot.security.SecurityUtil.getSessionUsername;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.mock.spring_boot.dto.ClubDto;
import com.mock.spring_boot.models.Club;
import com.mock.spring_boot.models.UserEntity;
import com.mock.spring_boot.repositories.ClubRepository;
import com.mock.spring_boot.repositories.UserRepository;
import com.mock.spring_boot.services.ClubService;

@Service
public class ClubServiceImpl implements ClubService {

	@Value("${spring.security.user.name}")
	private String adminUsername;
	private ClubRepository clubRepository;
	private UserRepository userRepository;
	private String sessionUsername = getSessionUsername();
	private UserEntity sessionUser = sessionUsername != null ? userRepository.findByUsername(sessionUsername) : null;
	
	public ClubServiceImpl(ClubRepository clubRepository, UserRepository userRepository) {
		super();
		this.clubRepository = clubRepository;
		this.userRepository = userRepository;
	}

	@Override
	public List<ClubDto> findAllClubs() {
		List<Club> clubs =  clubRepository.findAll();
		List<ClubDto> clubDtos = clubs.stream().map(club -> {
			ClubDto clubDto = mapToClubDto(club);
			if (clubDto.getCreatedBy() == null) {
				UserEntity adminUser = userRepository.findByUsername(adminUsername);
				clubDto.setCreatedBy(adminUser);
				this.updateClub(clubDto);
			}
			return clubDto;
		
		}).toList(); 
		return clubDtos;
	}

	@Override
	public Club saveClub(ClubDto clubDto) {
		Club club = mapToClub(clubDto);
		club.setCreatedBy(sessionUser);
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
