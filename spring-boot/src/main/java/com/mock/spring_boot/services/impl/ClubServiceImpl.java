package com.mock.spring_boot.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import lombok.Builder;

import org.springframework.beans.factory.annotation.Autowired;

import com.mock.spring_boot.dto.ClubDto;
import com.mock.spring_boot.models.Club;
import com.mock.spring_boot.repositories.ClubRepository;
import com.mock.spring_boot.services.ClubService;

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
	
	private ClubDto mapToClubDto(Club club) {
		ClubDto clubDto = ClubDto.builder()
				.id(club.getId())
				.title(club.getTitle())
				.photoURL(club.getPhotoURL())
				.content(club.getContent())
				.createdOn(club.getCreatedOn())
				.updatedOn(club.getUpdatedOn())
				.build();
		return clubDto;
	}

}
