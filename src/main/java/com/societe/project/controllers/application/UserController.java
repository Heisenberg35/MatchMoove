package com.societe.project.controllers.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.societe.project.models.Compte;
import com.societe.project.services.CompteService;

@Controller
public class UserController {

	private static final String URL_GESTION_COMPTE  = "/user/gestioncompte";
	
	private static final String VUES 	            = "user";
	private static final String VUE_GESTION_COMPTE  = VUES + "/gestioncompte";
	
	@Autowired
	CompteService compteService;

	@RequestMapping(value={UserController.URL_GESTION_COMPTE}, method=RequestMethod.GET)
	public String gestionCompte(Model model) {
		
		SecurityContext securityContext = SecurityContextHolder.getContext();
		String email = securityContext.getAuthentication().getName();
		Compte compte = compteService.finByEmailCompte(email);

		model.addAttribute("compte", compte);
		System.out.println("Page de gestion du compte");
		System.out.println(compte.getEmail());
		System.out.println(compte.getProfil().getFirstname());
		System.out.println(compte.getProfil().getAdresses());
		return VUE_GESTION_COMPTE;
	}
}
