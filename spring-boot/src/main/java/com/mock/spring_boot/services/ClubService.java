package com.mock.spring_boot.services;

import java.util.List;

import com.mock.spring_boot.dto.ClubDto;

public interface ClubService {
	List<ClubDto> findAllClubs();

}
