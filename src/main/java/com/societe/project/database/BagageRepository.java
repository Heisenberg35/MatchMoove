package com.societe.project.database;

import org.springframework.stereotype.Repository;

import com.societe.project.database.base.BaseCRUDRepository;
import com.societe.project.models.Bagage;
@Repository
public interface BagageRepository extends BaseCRUDRepository<Bagage> {
	
}
