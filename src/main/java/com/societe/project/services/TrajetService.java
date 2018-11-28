package com.societe.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.societe.project.database.TrajetRepository;
import com.societe.project.database.base.BaseCRUDRepository;
import com.societe.project.models.Trajet;
import com.societe.project.services.base.BaseService;


@Service
public class TrajetService extends BaseService<Trajet> {
	
	@Autowired
	private TrajetRepository trajetRepository;

	@Override
	protected List<Trajet> setItemsByCriterias(Trajet item, List<Trajet> result) {
		if (!item.getPerimetre().equals(null) && !item.getDateDepart().equals(null)) {
			result = this.trajetRepository.findByPerimetreAndDateDepart(item.getPerimetre(), item.getDateDepart());
		}else if (!item.getPerimetre().equals(null)) {
			result = this.trajetRepository.findByPerimetre(item.getPerimetre());
		} else if (!item.getDateDepart().equals(null)) {
			result = this.trajetRepository.findByDateDepart(item.getDateDepart());
		}
		
		
		
		//To-Do : faire les conditions pour les autres criterias (point)
		return result;
	}

	@Override
	protected BaseCRUDRepository<Trajet> getCRUDRepository() {
		return trajetRepository;
	}
}