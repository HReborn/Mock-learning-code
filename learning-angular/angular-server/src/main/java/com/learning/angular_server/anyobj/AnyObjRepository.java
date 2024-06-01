package com.learning.angular_server.anyobj;

import org.springframework.data.jpa.repository.JpaRepository;

interface AnyObjRepository extends JpaRepository<AnyObj, Long> {
	
}