package com.societe.project.controllers.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.societe.project.services.RecuperationInfoLogin;

@Controller
@Secured("ROLE_ADMIN")
public class AdminController {
	@Autowired
	RecuperationInfoLogin recuperationInfoLogin;
	public static final String BASE_URL = "/admin/";
	
	
	@RequestMapping(value = {"/admin"})
	public String showPage(Model model) {
		model.addAttribute("userEmail",recuperationInfoLogin.recuperationCompteForUserLogge().getEmail());
		return "/admin";
	}
}
