package com.societe.project.controllers.application;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.societe.project.models.Profil;
import com.societe.project.services.AdresseService;
import com.societe.project.services.CarService;
import com.societe.project.services.CompteService;
import com.societe.project.services.ProfilService;
import com.societe.project.services.RecuperationInfoLogin;

@Controller
public class UserController {

	@Autowired
	ProfilService profilService;
	@Autowired
	CompteService compteService;
	@Autowired
	AdresseService adresseService;
	@Autowired
	CarService carService;
	@Autowired
	RecuperationInfoLogin recuperationInfoLogin;
	
	
	@RequestMapping(value = {"/user/edit/{id}"}, method=RequestMethod.GET)
	public String gestionProfil(Model model) {
		ArrayList<String> roles = recuperationInfoLogin.recuperationRole();
		Profil profil = recuperationInfoLogin.recuperationProfil();
		model.addAttribute("roles", roles);
		model.addAttribute("profil", profil);
		return "/user/edit";
	}
}
