package com.mock.spring_boot.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mock.spring_boot.models.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	
	UserEntity findByEmail(String email);
	UserEntity findByUsername(String username);

}
