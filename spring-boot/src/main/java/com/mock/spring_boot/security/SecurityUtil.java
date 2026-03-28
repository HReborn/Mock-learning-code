package com.mock.spring_boot.security;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityUtil {
	public static String getSessionUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
			return null;
		}
		return authentication.getName();
	}
	
	public static boolean isSuperAdmin() {
		return SecurityContextHolder.getContext()
				.getAuthentication()
				.getAuthorities().stream()
				.anyMatch(a ->a.getAuthority().equals("ROLE_SUPER_ADMIN"));
	}
}
