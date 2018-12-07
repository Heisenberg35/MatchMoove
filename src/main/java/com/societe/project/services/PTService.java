package com.societe.project.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.societe.project.database.PTRepository;
import com.societe.project.database.base.BaseCRUDRepository;
import com.societe.project.models.Adresse;
import com.societe.project.models.Compte;
import com.societe.project.models.PT;
import com.societe.project.models.Point;
import com.societe.project.models.Trajet;
import com.societe.project.services.base.BaseService;
@Service
public class PTService extends BaseService<PT> {

	@Autowired
	private PTRepository ptRepository;
	
	@Autowired
	CompteService compteService;
	@Autowired
	ProfilService profilService;
	@Autowired
	AdresseService adresseService;
	@Autowired
	TrajetService trajetService;
	@Autowired
	PTService  ptService;
	
	@Override
	protected BaseCRUDRepository<PT> getCRUDRepository() {
		
		return ptRepository;
	}

	@Override
	protected List<PT> setItemsByCriterias(PT item, List<PT> result) {
		if (!item.getNbrePlace().equals(null)) {
			result = this.ptRepository.findByNbrePlace(item.getNbrePlace());
		}else if (!item.getVolumeMax().equals(null)) {
			result = this.ptRepository.findByVolumeMax(item.getVolumeMax());
		}
		return result;
	}
	
	public void insertTrajetDur() {
		
		//recuperation compte
		Compte  user = compteService.finByEmailCompte("user@gmail.com");
		
		Adresse domicile = new Adresse(0,"Avenue de la Marne",56000,"vannes",true,user.getProfil());
		Adresse work = new Adresse(1,"Pierre de Maupertuis",35170,"rennes",false,user.getProfil());
		
		//save
		adresseService.save(domicile);
		adresseService.save(work);
		
		
		//creation des point
		Point pointDepart = new Point();
		pointDepart.setAltitude(48.383);
		pointDepart.setLongitude(-4.500);
		
		
		Point pointArrive = new Point();
		pointArrive.setAltitude(48.513618);
		pointArrive.setLongitude(-2.770696);
		
		
		
		Trajet userTrajet = new Trajet();
		userTrajet.setNom("TrajetUser");
		userTrajet.setPerimetre(50.2);
		
		userTrajet.setHeureDepart(2);
		userTrajet.setMinuteDepart(24);
		
		Date aujourdhui = new Date();
		SimpleDateFormat formater = null;
		
	    formater = new SimpleDateFormat("dd-MM-yy");
	    //System.out.println(formater.format(aujourdhui));
	    userTrajet.setDateDepart((java.sql.Date) aujourdhui);
		
		
		trajetService.save(userTrajet);
		
		PT pt = new PT();
		pt.setNbrePlace(3);
		pt.setTrajet(userTrajet);
		pt.setProfil(user.getProfil());
		
		ptService.save(pt);
	}
}
