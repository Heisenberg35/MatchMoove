package com.societe.project.controllers;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.societe.project.services.RecuperationInfoLogin;

@Controller
public class HomeController {

	@Autowired
	RecuperationInfoLogin recuperationInfoLogin;
	
	@RequestMapping(value = {"/home"})
	public String showPage(Model model) {
		//Ici je récupère la liste des roles de l'utilisateur connecté afin de passer dans la vue les différents roles
//		ArrayList<String> roles = new ArrayList<>();
//		SecurityContext securityContext = SecurityContextHolder.getContext();
//		Collection<? extends GrantedAuthority> role = securityContext.getAuthentication().getAuthorities();
//		for (GrantedAuthority grantedAuthority : role) {
//			roles.add(grantedAuthority.getAuthority());
//		}
		
		ArrayList<String> roles = recuperationInfoLogin.recuperationRole();
		model.addAttribute("roles", roles);
		return "/home";
	}
	
}

