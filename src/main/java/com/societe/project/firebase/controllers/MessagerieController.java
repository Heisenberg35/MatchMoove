package com.societe.project.firebase.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.api.core.ApiFuture;
import com.google.firebase.database.DatabaseReference;
import com.societe.project.firebase.FirebaseNotificationObserver;
import com.societe.project.firebase.FirebaseOpenHelper;
import com.societe.project.models.Trajet;
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
	public String Index(Model model) throws IOException {
        Trajet trajet = new Trajet("saintmalo");
	/*	try {
			FirebaseOpenHelper
			                .getInstance()
			                .getDatabase()
			                .getReference("conversations/"+trajet.getNom());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
        // model.addAttribute("notification",FirebaseNotificationObserver.getInstance().getNotification());
		DatabaseReference Ref = FirebaseOpenHelper.getInstance().getDatabase().getReference("conversations/");
		DatabaseReference trajetRef = Ref.push();
		trajetRef.setValueAsync(trajet.getNom());
		String trajetToken = trajetRef.getKey();
		System.out.println(Ref);
		
	  
		//Map<String, Object> trajets = new HashMap<>();;
		//Object childRef = trajets.put("trajet", trajet);
		//Ref.updateChildrenAsync(trajets);
      
		
		//System.out.println(childRef);
		model.addAttribute("trajet", trajetToken);
		model.addAttribute("userEmail",recuperationInfoLogin.recuperationCompteForUserLogge().getEmail());
		return "/messagerie";
	}
	
}
