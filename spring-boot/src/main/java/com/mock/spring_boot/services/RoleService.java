package com.mock.spring_boot.services;

import com.mock.spring_boot.models.Role;

public interface RoleService {

	void updateRole(Role role);
	Role createRole(Role role);
	Role findById(Long id);
	Role findByName(String roleName);
	void deleteRole(Long id);
	
	
}
