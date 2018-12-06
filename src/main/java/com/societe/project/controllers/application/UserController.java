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
import com.societe.project.services.AdresseService;
import com.societe.project.services.CompteService;
import com.societe.project.services.ProfilService;

@Controller
public class UserController {

	private static final String URL_GESTION_COMPTE  = "/user/gestioncompte";
	
	private static final String VUES 	            = "user";
	private static final String VUE_GESTION_COMPTE  = VUES + "/gestioncompte";
	
	
	private static final String URL_TRAJET_USER  = "/user/researchtrajet";
	private static final String VUE_MATCH_TRAJET_COMPTE   = "/trajets/matchTrajet";
	
	@Autowired
	CompteService compteService;
	@Autowired
	ProfilService profilService;
	@Autowired
	AdresseService adresseProfil;

	@RequestMapping(value={UserController.URL_GESTION_COMPTE}, method=RequestMethod.GET)
	public String gestionCompte(Model model) {
		
		SecurityContext securityContext = SecurityContextHolder.getContext();
		String email = securityContext.getAuthentication().getName();
		Compte compte = compteService.finByEmailCompte(email);

		model.addAttribute("compte", compte);
		return VUE_GESTION_COMPTE;
	}
	
	@RequestMapping(value={UserController.URL_GESTION_COMPTE}, method=RequestMethod.POST)
	public String modificationCompte(@ModelAttribute Compte compte,Model model) {
		profilService.save(compte.getProfil());

		return "redirect:" + URL_GESTION_COMPTE;
	}
	
	
	@RequestMapping(value= {UserController.URL_TRAJET_USER},method=RequestMethod.GET)
	public String matchTrajet() {
		System.out.println("matchTrajet");
		
		//recuperation de la list des trajets
		
		return VUE_MATCH_TRAJET_COMPTE ;
	}
	@RequestMapping(value= {UserController.URL_TRAJET_USER},method=RequestMethod.POST)
	public String matchTrajetSave() {
		System.out.println("POST save matchTrajet");
		
		return VUE_MATCH_TRAJET_COMPTE ;
	}
	
}
