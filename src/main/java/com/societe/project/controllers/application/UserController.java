package com.societe.project.controllers.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.societe.project.models.Adresse;
import com.societe.project.models.Car;
import com.societe.project.models.Compte;
import com.societe.project.models.PT;
import com.societe.project.models.Trajet;
import com.societe.project.services.AdresseService;
import com.societe.project.services.CarService;
import com.societe.project.services.CompteService;
import com.societe.project.services.PTService;
import com.societe.project.services.ProfilService;
import com.societe.project.services.RecuperationInfoLogin;
import com.societe.project.services.TrajetService;
import com.societe.project.validators.CompteValidatorForGestionUser;

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
	AdresseService adresseService;
	@Autowired
	CarService carService;
	
	@Autowired
	TrajetService trajetService;
	@Autowired
	PTService  ptService;
	
	
	@Autowired
	CompteValidatorForGestionUser compteValidatorForGestionUser;
	@Autowired
	RecuperationInfoLogin recuperationInfoLogin;

	@RequestMapping(value={UserController.URL_GESTION_COMPTE}, method=RequestMethod.GET)
	public String gestionCompte(Model model) {
		
		Compte compte = recuperationInfoLogin.recuperationCompteForUserLogge();

		model.addAttribute("compte", compte);
//		model.addAttribute("errors", bindingResult);
		return VUE_GESTION_COMPTE;
	}
	
	@RequestMapping(value={UserController.URL_GESTION_COMPTE}, method=RequestMethod.POST)
	public String modificationCompte(@ModelAttribute Compte compte, BindingResult bindingResult, Model model) {
		System.out.println(compte);
		compteValidatorForGestionUser.validate(compte, bindingResult);
		
		if (bindingResult.hasErrors()) {
			System.out.println(bindingResult);
			return "redirect:" + URL_GESTION_COMPTE;
        }
		
		profilService.save(compte.getProfil());
		
		List<Adresse> adresses = compte.getProfil().getAdresses();
		List<Car> cars = compte.getProfil().getCars();
		
		for (Adresse adresse : adresses) {
			adresseService.save(adresse);
		}
		
		for (Car car : cars) {
			carService.save(car);
		}

		return "redirect:/home";
	}

	
	/**
	 * *********************************************************
	 * 		reseach trajet
	 * ***********************************************************
	 */
	
	
	@RequestMapping(value= {UserController.URL_TRAJET_USER},method=RequestMethod.GET)
	public String matchTrajet(Model model) {
		System.out.println("matchTrajet");
		
		
		
		List <PT> listPt = (List<PT>) ptService.findAll();
		//model.addAttribute()
		
		for (PT pt : listPt) {
			pt.affPT();
		}
		
		return VUE_MATCH_TRAJET_COMPTE ;
	}
	@RequestMapping(value= {UserController.URL_TRAJET_USER},method=RequestMethod.POST)
	public String matchTrajetSave() {
		System.out.println("POST save matchTrajet");
		
		return VUE_MATCH_TRAJET_COMPTE ;
	}
	
	
	
}
