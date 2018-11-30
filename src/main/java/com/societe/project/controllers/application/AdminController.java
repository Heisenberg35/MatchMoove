package com.societe.project.controllers.application;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Secured("ROLE_ADMIN")
//@RequestMapping(AdresseController.BASE_URL)
public class AdminController {
	//public static final String BASE_URL = "/admin";
	
//	public static String getBaseUrl() {
//		return BASE_URL;
//	}
		
	@RequestMapping(value = {"/admin"})
	public String showPage(Model model) {
		
		return "/admin";
	}
}
