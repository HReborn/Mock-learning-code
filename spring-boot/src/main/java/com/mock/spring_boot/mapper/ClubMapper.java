package com.mock.spring_boot.mapper;

import com.mock.spring_boot.dto.ClubDto;
import com.mock.spring_boot.models.Club;

public class ClubMapper {
	
	public static ClubDto mapToClubDto(Club club) {
		ClubDto clubDto = ClubDto.builder()
				.id(club.getId())
				.title(club.getTitle())
				.photoURL(club.getPhotoURL())
				.content(club.getContent())
				.createdOn(club.getCreatedOn())
				.updatedOn(club.getUpdatedOn())
				.events(club.getEvents())
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
				.events(clubDto.getEvents())
				.build();
		return club;
	}
}