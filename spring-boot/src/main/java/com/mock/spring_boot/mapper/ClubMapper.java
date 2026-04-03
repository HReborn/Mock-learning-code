package com.mock.spring_boot.mapper;

import static com.mock.spring_boot.mapper.EventMapper.mapToEventDto;

import com.mock.spring_boot.dto.ClubDto;
import com.mock.spring_boot.models.Club;

import java.util.stream.Collectors;

public class ClubMapper {
	
	public static ClubDto mapToClubDto(Club club) {
		ClubDto clubDto = ClubDto.builder()
				.id(club.getId())
				.title(club.getTitle())
				.photoURL(club.getPhotoURL())
				.content(club.getContent())
				.createdOn(club.getCreatedOn())
				.updatedOn(club.getUpdatedOn())
				.createdByUsername(club.getCreatedBy().getUsername())
				.lastUpdatedByUsername(club.getLastUpdatedBy().getUsername())
				.events(club.getEvents().stream().map(event -> mapToEventDto(event)).collect(Collectors.toList()))
				.build();
		return clubDto;
	}

	public static Club mapToClub(ClubDto clubDto) {
		Club club = Club.builder()
				.id(clubDto.getId())
				.title(clubDto.getTitle())
				.photoURL(clubDto.getPhotoURL())
				.content(clubDto.getContent())
				.createdOn(clubDto.getCreatedOn())
				.updatedOn(clubDto.getUpdatedOn())
				.build();
		return club;
	}
}