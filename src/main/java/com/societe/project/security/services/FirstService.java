package com.societe.project.security.services;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.societe.project.database.CompteRepository;
import com.societe.project.models.Article;
import com.societe.project.models.Compte;
import com.societe.project.models.Profil;
import com.societe.project.models.Role;
import com.societe.project.services.ArticleService;
import com.societe.project.services.CompteService;
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
            Article article = new Article("Ecologie : il est encore temps!", "En France, cette journée prend une signification toute particulière : il s'agit de la première mobilisation de la socièté civile depuis la démission de Nicolas Hulot. Comme l’explique Clémence Dubois, porte parole de 350.org, la démission de Nicolas Hulot nous rappelle que la France n’est pas une exception : partout dans le monde, les dirigeants politiques continuent de tergiverser, voire ont renoncé à agir pour le climat. ", date, compte);
            articleService.save(article);
            Article article2 = new Article("Taxe carbone : on vous dit tout ! ", "L'idée est de donner un prix au carbone est pour limiter les émissions de gaz responsables du changement climatique a été proposé lors du protocole de Kyoto en 1997. La taxe carbone sur les énergies fossiles, comme le gaz, le pétrole et leurs dérivés, qui émettent beaucoup de CO2, faisait partie du pacte écologique que Nicolas Hulot avait fait signer aux candidats à la présidentielle en 2007.", date, compte);
            articleService.save(article2);
            Article article3 = new Article("Covoiturage : économique, écologie et convivial !", "Le covoiturage réduit votre bilan carbone. Le Bilan Carbone des émissions d'un trajet est pris en charge par le conducteur. Les passagers voyagent donc sans émettre de CO2. Sur une vision globale, la quantité de CO2 émise est constante pour un trajet, et plus le nombre de voyageurs dans l'auto sera grand, moins la quantitÃ© de CO2 émise par voyageur sera élevée.", date, compte);
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