package com.societe.project.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.societe.project.database.CompteRepository;
import com.societe.project.database.base.BaseCRUDRepository;
import com.societe.project.dto.CompteProfilDto;
import com.societe.project.models.Compte;
import com.societe.project.models.Profil;
import com.societe.project.models.Role;
import com.societe.project.services.base.BaseService;

@Service
public class CompteService extends BaseService<Compte> {

	@Autowired
	private CompteRepository compteRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private CompteProfilDto dto;
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private ProfilService profilService;
	
	@Override
	protected BaseCRUDRepository<Compte> getCRUDRepository() {
		return compteRepository;
	}

	public CompteProfilDto getDto() {
		return dto;
	}

	public void setDto(CompteProfilDto dto) {
		this.dto = dto;
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


@Override
protected List<Compte> setItemsByCriterias(Compte item, List<Compte> result) {
	// TODO Auto-generated method stub
	return null;
}

public Compte findByEmail(String email) {
	return compteRepository.findByEmail(email);
}

	public Compte finByEmailCompte(String email) {
		
		return compteRepository.findByEmail(email);
	}
	
	public void initElementTable(Role role) {
		
		Compte compte = dto.getCreateCompte();
		Profil profil = dto.getCreateProfil();

		profilService.save(profil);
		role.setProfil(profil);
		
		roleService.save(role);
		
		compte.setRole(role);
		compte.setProfil(profil);
		compte.setActive(1);
		
		compte.setActive(1);
		
		this.save(compte);
		profil.setCompte(compte);
		
		profilService.save(profil);	
	}


}
