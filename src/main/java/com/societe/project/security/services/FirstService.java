package com.societe.project.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.societe.project.database.CompteRepository;
import com.societe.project.models.Compte;
import com.societe.project.models.Profil;
import com.societe.project.models.Role;
import com.societe.project.services.CompteService;
import com.societe.project.services.ProfilService;
import com.societe.project.services.RoleService;

@Service
public class FirstService {
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private CompteService compteService;
	
<<<<<<< HEAD
	@Autowired
	private CompteRepository compteRepository;
	
	@Autowired
	private ProfilService profilService;
=======
	public void createFirstAdmin() {
		try {
			Role role = new Role("ROLE_ADMIN");
			this.roleService.save(role);
			
			//Profil profil = new Profil("superadmin", "superadmin", "0122334455");
				
			Compte compte = new Compte("superadmin@gmail.com", "l",1, role);
			this.compteService.save(compte);
		} catch (Exception e) {
			// TODO: Pour le moment un try catch pour eviter de drop la database à chaque lancement de l'application A MODIFIER
			
		}
		
			
		}
>>>>>>> lama
	
	public void createFirstAdminAndFirstUser(String initRole) {
        if(!isExistAdminOrUser("admin@gmail.com")) {
            initElementTable(initRole,"admin","admin","0122334455","admin@gmail.com","admin");
        }else if(!isExistAdminOrUser("user@gmail.com")) {
                initElementTable(initRole,"user","user","0122334455","user@gmail.com","user");
        }
	}
	
	public void initElementTable(String Role,String nom, String prenom, String phoneNumber, String mail,String pass) {

        Profil profil = new Profil(nom,prenom, pass);
        Role role = new Role(Role);

        profilService.save(profil);
        role.setProfil(profil);
        roleService.save(role);

        Compte compte = new Compte(mail,pass,1);
        
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

