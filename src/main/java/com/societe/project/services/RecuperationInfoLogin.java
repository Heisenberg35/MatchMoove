package com.societe.project.services;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class RecuperationInfoLogin {

	public ArrayList<String> recuperationRole() {
		ArrayList<String> roles = new ArrayList<>();
		SecurityContext securityContext = SecurityContextHolder.getContext();
		Collection<? extends GrantedAuthority> role = securityContext.getAuthentication().getAuthorities();
		for (GrantedAuthority grantedAuthority : role) {
			roles.add(grantedAuthority.getAuthority());
		}
		return roles;
	}
}
