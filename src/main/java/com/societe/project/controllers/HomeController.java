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

import com.societe.project.models.Profil;
import com.societe.project.services.RecuperationInfoLogin;

@Controller
public class HomeController {

	@Autowired
	RecuperationInfoLogin recuperationInfoLogin;
	
	@RequestMapping(value = {"/home"})
	public String showPage(Model model) {
		ArrayList<String> roles = recuperationInfoLogin.recuperationRole();
		Profil profil = recuperationInfoLogin.recuperationProfil();
		model.addAttribute("roles", roles);
		model.addAttribute("profil", profil);
		return "/home";
	}
}

