package com.societe.project.controllers.application;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Secured("ROLE_ADMIN")
public class AdminController {
		
	@RequestMapping(value = {"/admin"}, method=RequestMethod.GET)
	public String showPage(Model model) {
		
		return "/admin";
	}
}
