package com.societe.project.security.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.societe.project.database.CompteRepository;
import com.societe.project.models.Article;
import com.societe.project.models.Compte;
import com.societe.project.models.Profil;
import com.societe.project.models.Role;
import com.societe.project.services.ArticleService;
import com.societe.project.services.CompteService;
import com.societe.project.services.PTService;
import com.societe.project.services.ProfilService;
import com.societe.project.services.RoleService;

@Service
public class FirstService {

	@Autowired
	private RoleService roleService;

	@Autowired
	private CompteService compteService;

	@Autowired
	private CompteRepository compteRepository;

	@Autowired
	private ProfilService profilService;
	
//	@Autowired
//	private PTService ptService;
	@Autowired
	private ArticleService articleService;

	public void createFirstAdminAndFirstUser(String initRole) {
        if(!isExistAdminOrUser("admin@gmail.com")) {
            Compte compte = initElementTable(initRole,"admin","admin","0122334455","admin@gmail.com","admin");
            Date date = new Date(); 
            Article article = new Article("Article 1", "Article 1", date, compte);
            articleService.save(article);
            Article article2 = new Article("Article 2", "Article 2", date, compte);
            articleService.save(article2);
            Article article3 = new Article("Article 3", "Article 3", date, compte);
            articleService.save(article3);
        }else if(!isExistAdminOrUser("user@gmail.com")) {
                initElementTable(initRole,"user","user","0122334455","user@gmail.com","user");
        }
    }
	
//	public void createFirstAdminAndFirstUser(String initRole) {
//        if(!isExistAdminOrUser("admin@gmail.com")) {
//            initElementTable(initRole,"admin","admin","0122334455","admin@gmail.com","admin");
//            ptService.insertTrajetDur("admin@gmail.com",0);
//        }else if(!isExistAdminOrUser("user@gmail.com")) {
//                initElementTable(initRole,"user","user","0122334455","user@gmail.com","user");
//                ptService.insertTrajetDur("user@gmail.com",1);
//        }else if(!isExistAdminOrUser("jerem@gmail.com")) {
//            initElementTable(initRole,"jerem","frc","0122334455","jerem@gmail.com","user");
//            ptService.insertTrajetDur("jerem@gmail.com",2);
//        }
//	}
        
      //recuperation de la list des trajets		




    public boolean isExistAdminOrUser(String mail) {
        Compte compte = compteRepository.findByEmail(mail);
        return (compte != null) ? true : false;
    }
	
	public Compte initElementTable(String Role,String nom, String prenom, String phoneNumber, String mail,String pass) {

        Profil profil = new Profil(nom,prenom,pass);
        profil.setPhoneNumber("02 97 01 95 22");
        Role role = new Role(Role);	

        profilService.save(profil);
        role.setProfil(profil);
        
       
        Compte compte = new Compte(mail,pass,1);
        roleService.save(role);
        compte.setRole(role);
        compte.setProfil(profil);
        compteService.save(compte);
        profil.setCompte(compte);
        profilService.save(profil);
        
        return compte;
    }
	
}
