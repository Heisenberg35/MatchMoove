package com.societe.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.societe.project.database.CompteRepository;
import com.societe.project.database.base.BaseCRUDRepository;
import com.societe.project.models.Compte;
import com.societe.project.services.base.BaseService;

@Service
public class CompteService extends BaseService<Compte> {

	@Autowired
	private CompteRepository compteRepository;
	
	@Override
	protected BaseCRUDRepository<Compte> getCRUDRepository() {
		return compteRepository;
	}

	@Override
	protected List<Compte> setItemsByCriterias(Compte item, List<Compte> result) {
		if (!item.getEmail().equals("")) {
			result = this.compteRepository.findByEmail(item.getEmail());
		}
		return result;
	}

}
