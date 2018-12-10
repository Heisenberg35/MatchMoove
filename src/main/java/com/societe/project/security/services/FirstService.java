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
	private ArticleService articleService;

	public void createFirstAdminAndFirstUser(String initRole) {
        if(!isExistAdminOrUser("admin@gmail.com")) {
            Compte compte = initElementTable(initRole,"admin","admin","0122334455","admin@gmail.com","admin");
            Date date = new Date(); 
            Article article = new Article("Ecologie : il est encore temps!", "En France, cette journée prend une signification toute particulière : il s’agit de la première mobilisation de la société civile depuis la démission de Nicolas Hulot. Comme l’explique Clémence Dubois, porte parole de 350.org, la démission de Nicolas Hulot nous rappelle que la France n’est pas une exception : partout dans le monde, les dirigeants politiques continuent de tergiverser, voire ont renoncé à agir pour le climat. Pourtant, il est encore temps d’agir, et nous le faisons, partout dans le monde, comme nous l’avons démontré aujourd’hui.La marche pour le climat parisienne, qui a réuni plus de 50 000 personnes était ouverte par deux banderoles. Le cortège a ainsi rappelé que l’action pour le climat est indissociable d’une rupture avec les politiques néolibérales.Pour Maxime Combes d’Attac, “ce succès montre que le sursaut citoyen est là ! Il ne manque que le sursaut politique ! Des mesures courageuses et visionnaires doivent être imposées à des lobbys qui n’en veulent pas : en matière d’écologie, le “En même temps” d’Emmanuel Macron ne fonctionne pas ! Il est justement temps d’écarter durablement les vieilles recettes libérales et productivistes qui aggravent la situation et de soutenir, avec enthousiasme, les voies alternatives qui s’expérimentent déjà Plus de 130 actions se sont tenues partout en France, autour de revendications communes : stopper l’extraction des combustibles fossiles, afin d’engager la transition juste vers un avenir 100% renouvelable pour toutes et tous. Ces actions ont mis l’accent sur la responsabilité des collectivités locales.Des organisations syndicales ont également pris part aux défilés : la transition vers un futur renouvelable doit se faire avec pour horizon la justice sociale : c’est le meilleur moyen de créer des emplois durables, non-délocalisables et de qualité, explique Didier Aubé pour l’Union syndicale Solidaires.", date, compte);
            articleService.save(article);
            Article article2 = new Article("Taxe carbone : on vous dit tout ! ", "L’idée de « donner un prix au carbone » pour limiter les émissions de gaz responsables du changement climatique a été évoquée lors du protocole de Kyoto en 1997. La « taxe carbone » sur les énergies fossiles, comme le gaz, le pétrole et leurs dérivés, qui émettent beaucoup de CO2, faisait partie du pacte écologique que Nicolas Hulot avait fait signer aux candidats à la présidentielle en 2007.Il s’agissait de créer une contribution d’un montant d’abord symbolique, qui augmenterait progressivement et régulièrement pour inciter les particuliers et entreprises le temps de s’adapter (par exemple en changeant de voiture, en isolant les bâtiments, en s’équipant de machines moins consommatrices…)nDepuis quand existe-t-elle en France ? La taxe actuelle a vu le jour en 2014, après deux tentatives ratées : en 2000, le gouvernement de Lionel Jospin avait voulu étendre aux produits énergétiques la taxe générale sur les activités polluantes (TGAP, réservée aux déchets) avec le double objectif de lutter contre le changement climatique et financer les 35 heures. Mais la mesure avait été censurée par le Conseil constitutionnel, parce que sa portée écologique était peu claire, et parce qu’elle s’étendait à l’électricité, qui émet pourtant peu de CO2 – le nucléaire étant, en France, la principale source de production d’électricitéen 2009, après le Grenelle de l’environnement, Nicolas Sarkozy avait instauré une contribution climat-énergie (CCE)… qui a été à son tour censurée par les « sages », au motif que les multiples exceptions sectorielles qui l’accompagnaient créaient une rupture de l’égalité devant l’impôt.", date, compte);
            articleService.save(article2);
            Article article3 = new Article("Covoiturage : économique, écologie et convivial !", "Le covoiturage réduit votre bilan carbone. Le Bilan Carbone des émissions d’un trajet est pris en charge par le conducteur. Les passagers voyagent donc sans émettre de CO2. Sur une vision globale, la quantité de CO2 émise est constante pour un trajet, et plus le nombre de voyageurs dans l’auto sera grand, moins la quantité de CO2 émise par voyageur sera élevée. Dans le cas d’une personne faisant de longs trajets chaque week-end, les économies de CO2 peuvent donc être importantes et permettent de recevoir un bonus CO2 sur votre compte CO2.Le covoiturage fait gagner du temps et de l’argent. Le covoiturage est aussi un excellent moyen de se déplacer là où d’autres transports en commun (train, car) ne le peuvent pas. C’est très souvent le cas lorsque vous ne bougez pas sur un axe central bien desservi par la SNCF. Par exemple pour aller de Brest à Nantes, c’est très long et incommode en train, tandis que c’est pratique et pas cher en covoiturage. Le covoiturage permet désormais une grande variété de destinations, compte tenu du grand nombre d’utilisateurs et de la possibilité de s’arrêter sur le chemin lors d’un trajet plus long. Plus vous covoiturez, plus vous réduisez vos émissions de CO2, et plus votre bonus CO2 sera élevé.Rappelons aussi l’avantage économique énorme de cette nouvelle approche de déplacement : par exemple un gain de 4 000 € pour quelqu’un qui le pratique régulièrement sur son trajet domicile travail. Quels autres bénéfices ? Avoir le réflexe covoiturage, c’est rendre sa voiture et le trajet réalisé plus écologique, mais c’est aussi un moyen de découvrir et de créer des liens sociaux avec des personnes le temps d’un trajet. Premier exemple :Amédée habite Paris et doit se rendre tous les quinze jours à Nantes pour voir sa petite amie. Ses horaires de travail et sa situation géographique font qu’il est difficile pour lui d’y aller en train une fois le week-end arrivé : l’Amour n’attend pas !. Amédée est bien décidé à prendre sa voiture mais il fait le calcul : à raison de deux aller-retours par mois (2×400 km), il se retrouve à parcourir 9600 km par an pour ces trajets. Suivant le véhicule et sa consommation, cela fait quand même entre 500 et 800 litres de carburant par an, soit entre 1,2 et 2 tonnes de CO2 par an. Cependant, Amédée s’est inscrit sur un site de covoiturage. Chaque semaine, il réussit à prendre entre 2 et 3 personnes pour chaque trajet. En plus de faire des économies et de réduire son empreinte carbone, il découvre chaque semaine de nouveaux individus et se découvrent des passions secrètes pour la vie de ces personnes qu’il côtoie le temps le temps de quelques heures. Lors du dernier trajet, une personne lui a parlé du Compte Épargne CO2 qui lui permettrait de valoriser encore plus ses covoiturages car il réalisait sans le savoir des réductions de CO2 qui mènent à une prime climat !", date, compte);
            articleService.save(article3);
        }else if(!isExistAdminOrUser("user@gmail.com")) {
                initElementTable(initRole,"user","user","0122334455","user@gmail.com","user");
        }
	}

	public Compte initElementTable(String Role, String nom, String prenom, String phoneNumber, String mail,
			String pass) {

		Profil profil = new Profil(nom, prenom, pass);
		Role role = new Role(Role);

		profilService.save(profil);
		role.setProfil(profil);

		Compte compte = new Compte(mail, pass, 1);
		roleService.save(role);
		compte.setRole(role);
		compte.setProfil(profil);
		compteService.save(compte);
		profil.setCompte(compte);
		profilService.save(profil);
		return compte;
	}

	public boolean isExistAdminOrUser(String mail) {
		Compte compte = compteRepository.findByEmail(mail);
		return (compte != null) ? true : false;
	}
}
