package com.societe.project.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.societe.project.models.Compte;
import com.societe.project.models.Role;
import com.societe.project.services.CompteService;
import com.societe.project.services.RoleService;

@Service
public class FirstService {
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private CompteService compteService;
	
	public void createFirstAdmin() {
		try {
			Role role = new Role("ROLE_ADMIN");
			this.roleService.save(role);
			
			//Profil profil = new Profil("superadmin", "superadmin", "0122334455");
				
			Compte compte = new Compte("superadmin@gmail.com", "superadmin",1, role);
			this.compteService.save(compte);
		} catch (Exception e) {
			// TODO: Pour le moment un try catch pour eviter de drop la database à chaque lancement de l'application A MODIFIER
			
		}
		
			
		}
	
	private boolean isExistFirstAdmin ( ) {
		
		return false;
		
	}
}

