package com.societe.project.firebase.controllers;

import java.io.IOException;
import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.societe.project.firebase.FirebaseNotificationObserver;
import com.societe.project.firebase.FirebaseOpenHelper;
import com.societe.project.models.Message;
import com.societe.project.services.ProfilService;
import com.societe.project.services.RecuperationInfoLogin;

@Controller
@RequestMapping("/messagerie")
public class MessagerieController {
	@Autowired
	RecuperationInfoLogin recuperationInfoLogin;
	
	/*@RequestMapping(value = {"","/"},method=RequestMethod.GET)
	public String messagerie(Model model) throws IOException, ParseException  {
		//model.addAttribute("message", FirebaseNotificationObserver.getInstance().getNotification());
	     //model.addAttribute("user",recuperationInfoLogin.recuperationCompteForUserLogge().getEmail());
		return "/messagerie";
		
	}*/
	
	@RequestMapping(value= {"","/"})
	public String Index(Model model) {
		/* try {
			FirebaseOpenHelper
			                .getInstance()
			                .getDatabase()
			                .getReference("/conversation/").setValueAsync(new);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/
		model.addAttribute("user",recuperationInfoLogin.recuperationCompteForUserLogge().getEmail());
		return "/messagerie";
	}
	
}
