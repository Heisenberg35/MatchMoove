package com.societe.project.controllers.application;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Secured("ROLE_ADMIN")
public class AdminController {
	
	public static final String BASE_URL = "/admin/";
	
	
	@RequestMapping(value = {"/admin"})
	public String showPage(Model model) {
		
		return "/admin";
	}
}
