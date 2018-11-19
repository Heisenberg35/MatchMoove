package com.societe.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.societe.project.database.PTRepository;
import com.societe.project.database.base.BaseCRUDRepository;
import com.societe.project.models.PT;
import com.societe.project.services.base.BaseService;
@Service
public class PTService extends BaseService<PT> {

	@Autowired
	private PTRepository ptRepository;
	@Override
	protected BaseCRUDRepository<PT> getCRUDRepository() {
		
		return ptRepository;
	}

	@Override
	protected List<PT> setItemsByCriterias(PT item, List<PT> result) {
		// TODO Auto-generated method stub
		return null;
	}

}