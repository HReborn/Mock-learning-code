package com.mock.spring_boot.services.impl;

import org.springframework.stereotype.Service;

import com.mock.spring_boot.models.Role;
import com.mock.spring_boot.repositories.RoleRepository;
import com.mock.spring_boot.services.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	private RoleRepository roleRepository;
		
	public RoleServiceImpl(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
		createDefaultRolesIfNotPresent();
	}
	
	private void createDefaultRolesIfNotPresent() {
		if (roleRepository.findByName("USER") == null) {
			roleRepository.save(Role.builder().name("USER").build());
		}
		if (roleRepository.findByName("USER") == null) {
			roleRepository.save(Role.builder().name("ADMIN").build());
		}
		if (roleRepository.findByName("USER") == null) {
			roleRepository.save(Role.builder().name("SUPER_ADMIN").build());
		}
	}

	@Override
	public void updateRole(Role role) {
		roleRepository.save(role);
	}

	@Override
	public Role createRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public Role findById(Long id) {
		return roleRepository.findById(id).get();
	}

	@Override
	public Role findByName(String roleName) {
		return roleRepository.findByName(roleName);
	}
	
	@Override
	public void deleteRole(Long id) {
		roleRepository.deleteById(id);
	}
}
