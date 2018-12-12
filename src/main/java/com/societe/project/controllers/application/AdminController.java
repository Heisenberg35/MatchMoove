package com.societe.project.controllers.application;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.societe.project.firebase.FirebaseService;
import com.societe.project.models.Trajet;
import com.societe.project.services.RecuperationInfoLoginService;

@Controller
@Secured("ROLE_ADMIN")
public class AdminController {
	@Autowired
	RecuperationInfoLoginService recuperationInfoLogin;
	@Autowired
	FirebaseService firebaseService;
	
	public static final String BASE_URL = "/admin/";
	
	
	@RequestMapping(value = {"/admin"})
	public String showPage(Model model) throws IOException {
		
		Trajet userTraget = firebaseService.getUserTrajet();
		if(!userTraget.getId().equals(-1))
		{model.addAttribute("trajetMessage",userTraget);}
		model.addAttribute("userEmail",recuperationInfoLogin.recuperationCompteForUserLogge().getEmail());
		return "/admin";
	}
}
