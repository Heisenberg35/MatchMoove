package com.societe.project.controllers.forms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.societe.project.controllers.application.AdminController;
import com.societe.project.models.Compte;
import com.societe.project.models.Profil;
import com.societe.project.services.CompteService;
import com.societe.project.services.RoleService;
import com.societe.project.validators.CompteValidator;
import com.societe.project.validators.Profvalidator;



@Controller
public class AppFormController {
	
	/*
	*************************************************
	*    @Constante
	*************************************************
	*/

	private static final String VUES 	           = "forms";
	
	private static final String URL_CREATE_COMPTE  = "/admin/createcompte";
	private static final String URL_CREATE_PROFIL  = "/admin/createprofil";
	
	
	private static final String VUE_CREATE_COMPTE = VUES + "/createcompte";
	private static final String VUE_CREATE_PROFIL = VUES + "/createprofil";
	
	/*
	*************************************************
	*    @private
	*************************************************
	*/
	
	@Autowired
	private RoleService roleService;
	@Autowired
	private CompteService compteService;
	@Autowired
	private CompteValidator compteValidator;
	
	@Autowired
	private Profvalidator profilValidator;
	
	/*
	*************************************************
	*    @Mapping createCompte get && Post
	*************************************************
	*/	
	
	
	
	@RequestMapping(value= {AppFormController.URL_CREATE_COMPTE}, method=RequestMethod.GET)
	public String createCompteM(Model model) {
		
		model.addAttribute("detailPath",URL_CREATE_COMPTE);
		model.addAttribute("roles", roleService.findAll());
		
		System.out.println("get de create user");
		
		return VUE_CREATE_COMPTE;
	}
	
	@RequestMapping(value= {AppFormController.URL_CREATE_COMPTE}, method=RequestMethod.POST)
	public String createCompteValidateM(@ModelAttribute Compte compte,@ModelAttribute Profil profil,@RequestParam String confirm, Model model) {
		
		System.out.println("Post de create user");
		System.out.println(confirm);
		System.out.println("------------------"+compte.getRole().getName());
		System.out.println("------------------"+compte.getRole().getId());
		compte.afficheCompte();
		profil.afficheProfil();

		boolean isvalid =false;
		
		//if(!compteValidator.validateCompteAndPassWord(compte) && !profilValidator.validateProfil(profil) && compteValidator.isComparePass(compte.getPassword(),confirm)) {
			
			System.out.println("compte not exist");
			
			isvalid =true;
			
			compteService.getDto().createCompte(compte);
			compteService.getDto().createProfit(profil);
			compteService.getDto().getCreateCompte().afficheCompte();
			compteService.getDto().getCreateProfil().afficheProfil();	
			compteService.initElementTable(compte);
			
		//}else {
			//System.out.println("error compte");
			//System.out.println(compteValidator.getErrors().get("password"));
			//model.addAttribute("detailPath",VUE_CREATE_COMPTE );
			//model.addAttribute("roles", roleService.findAll());
			//model.addAttribute("isExistMail",true);
			//model.addAttribute("form",compteValidator.getErrors());
		//}
		return (isvalid)? "redirect:"+AdminController.BASE_URL: VUE_CREATE_COMPTE;
	}
	
	
	@RequestMapping(value= {AppFormController.VUE_CREATE_COMPTE}, method=RequestMethod.GET)
	public String createCompte(Model model) {
		model.addAttribute("detailPath",VUE_CREATE_COMPTE );
		System.out.println("get de create user");
		return VUE_CREATE_COMPTE;
	}
	
	@RequestMapping(value= {AppFormController.VUE_CREATE_COMPTE}, method=RequestMethod.POST)
	public String createCompteValidate(@ModelAttribute Compte compte,Model model) {
		System.out.println("Post de create user");

		compte.afficheCompte();
		
		boolean isvalid =false;
		
		if(!compteValidator.validateCompteAndPassWord(compte)) {
			System.out.println("compte not exist");
			
			isvalid =true;
			compteService.getDto().createCompte(compte);
			compteService.getDto().getCreateCompte().afficheCompte();
		}else {
			System.out.println("error compte");
			System.out.println(compteValidator.getErrors().get("password"));
			
			model.addAttribute("detailPath",VUE_CREATE_COMPTE );
			//model.addAttribute("isExistMail",true);
			model.addAttribute("form",compteValidator.getErrors());
		}
		
		return (isvalid)? "redirect:"+VUE_CREATE_PROFIL : VUES+VUE_CREATE_COMPTE;
	}
	
	

	
	
}
