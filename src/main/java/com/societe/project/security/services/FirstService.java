package com.societe.project.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.societe.project.database.CompteRepository;
import com.societe.project.models.Compte;
import com.societe.project.models.Profil;
import com.societe.project.models.Role;
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
	
	@Autowired
	private PTService ptService;
	
	public void createFirstAdminAndFirstUser(String initRole) {
        if(!isExistAdminOrUser("admin@gmail.com")) {
            initElementTable(initRole,"admin","admin","0122334455","admin@gmail.com","admin");
            ptService.insertTrajetDur("admin@gmail.com");
            
        }else if(!isExistAdminOrUser("user@gmail.com")) {
                initElementTable(initRole,"user","user","0122334455","user@gmail.com","user");
                ptService.insertTrajetDur("user@gmail.com");
        }
      //recuperation de la list des trajets		
	}
	
	public void initElementTable(String Role,String nom, String prenom, String phoneNumber, String mail,String pass) {

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
    }
	
	public boolean isExistAdminOrUser (String mail) {
		Compte compte = compteRepository.findByEmail(mail);
        return (compte != null) ? true : false ;
    }
}

