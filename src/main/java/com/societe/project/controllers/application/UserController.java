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
	
	private static final String URL_PROPOSER_TRAJET  = "/user/proposertrajet";
	private static final String VUE_PROPOSER_TRAJET  = "/trajets/proposertrajet";
	
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
	PTService pTService;
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

		compteValidatorForGestionUser.validate(compte, bindingResult);
		
		if (bindingResult.hasErrors()) {
			model.addAttribute("errors", bindingResult);
			return "redirect:" + URL_GESTION_COMPTE;
        }
		
		profilService.save(compte.getProfil());
		
		List<Adresse> adresses = compte.getProfil().getAdresses();
		List<Car> cars = compte.getProfil().getCars();
		
		for (Adresse adresse : adresses) {
			adresseService.save(adresse);
		}
		
		if (cars.get(0).getMarque() != null) {
			for (Car car : cars) {
				carService.save(car);
			}
		}
	
		return "redirect:/home";
	}
	
	@RequestMapping(value={UserController.URL_PROPOSER_TRAJET}, method=RequestMethod.GET)
	public String proposerTrajet(Model model) {
		Compte compte = recuperationInfoLogin.recuperationCompteForUserLogge();
		Trajet trajet = null;
		PT pt = null;
		model.addAttribute("compte", compte);
		model.addAttribute("trajet", trajet);
		model.addAttribute("pt", pt);
		return VUE_PROPOSER_TRAJET;
	}
	
	@RequestMapping(value={UserController.URL_PROPOSER_TRAJET}, method=RequestMethod.POST)
	public String proposerTrajetSave(@ModelAttribute Compte compte, @ModelAttribute Trajet trajet, @ModelAttribute PT pt) {
		
		trajetService.save(trajet);

		pt.setprofil(compte.getProfil());
		pt.setTrajet(trajet);
		pTService.save(pt);
		
		return "redirect:/home";
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
