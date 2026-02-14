package com.mock.spring_boot.mapper;

import com.mock.spring_boot.dto.ClubDto;
import com.mock.spring_boot.models.Club;

import static com.mock.spring_boot.mapper.EventMapper.mapToEventDto;

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
				.events(club.getEvents().stream().map(event -> mapToEventDto(event)).collect(Collectors.toList()))
				.build();
		return clubDto;
	}
	
	// This method exists to avoid infinite calls between the mappers.
	// Unless there's a business rule change, the events won't reference each other
	// So, we'll use this mapper inside the EventMapper only.
	public static ClubDto mapToClubDtoWithoutEvents(Club club) {
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