package com.tictactoe.app;

import java.util.Optional;

import org.springframework.data.repository.Repository;

interface UserRepository extends Repository<Users, Long> {
	Users save(Users users);
	
	Optional<Users> findById(long id);
}
