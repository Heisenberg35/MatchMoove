package com.societe.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.societe.project.database.CompteRepository;
import com.societe.project.database.base.BaseCRUDRepository;
import com.societe.project.models.Compte;
import com.societe.project.services.base.BaseService;

@Service
public class CompteService extends BaseService<Compte> {

	@Autowired
	private CompteRepository compteRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	protected BaseCRUDRepository<Compte> getCRUDRepository() {
		return compteRepository;
	}

//	@Override
//	protected List<Compte> setItemsByCriterias(Compte item, List<Compte> result) {
//		if (!item.getEmail().equals("")) {
//			result = this.compteRepository.findByEmail(item.getEmail());
//		}
//		return result;
//	}

	@Override
	public void save(Compte item) {
		item.setPassword(bCryptPasswordEncoder.encode(item.getPassword()));
		super.save(item);
	}

<<<<<<< HEAD
@Override
protected List<Compte> setItemsByCriterias(Compte item, List<Compte> result) {
	// TODO Auto-generated method stub
	return null;
}

public Compte  findByEmail(String email) {
	return compteRepository.findByEmail(email);
}
=======
	@Override
	protected List<Compte> setItemsByCriterias(Compte item, List<Compte> result) {
		// TODO Auto-generated method stub
		return null;
	}
>>>>>>> master
	
	public Compte findByEmail(String email) {
		return this.compteRepository.findByEmail(email);
	}

}
