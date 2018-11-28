package com.societe.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping(value = {"," , "/login"})
	public String showPage() {
		return "/login";
		
	}
}

